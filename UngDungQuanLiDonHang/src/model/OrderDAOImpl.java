package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public int addOrder(int customerId, List<OrderItem> items) {
        int orderId = -1;
        String orderSQL = "INSERT INTO orders (customer_id) VALUES (?)";
        String orderItemSQL = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false); // Bắt đầu transaction

            // Thêm đơn hàng vào bảng orders
            try (PreparedStatement stmt = conn.prepareStatement(orderSQL, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setInt(1, customerId);
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    orderId = rs.getInt(1);
                }
            }

            // Thêm sản phẩm vào bảng order_items
            try (PreparedStatement stmt = conn.prepareStatement(orderItemSQL)) {
                for (OrderItem item : items) {
                    stmt.setInt(1, orderId);
                    stmt.setInt(2, item.getProductId());
                    stmt.setInt(3, item.getQuantity());
                    stmt.setDouble(4, item.getPrice());
                    stmt.executeUpdate();
                }
            }

            conn.commit(); // Xác nhận transaction
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderId;
    }

    @Override
    public List<Order> getOrdersByCustomerId(int customerId) {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM orders WHERE customer_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("id");
                Timestamp orderDate = rs.getTimestamp("order_date");
                orders.add(new Order(orderId, customerId, orderDate, getOrderItems(orderId)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    private List<OrderItem> getOrderItems(int orderId) {
        List<OrderItem> items = new ArrayList<>();
        String sql = "SELECT * FROM order_items WHERE order_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                items.add(new OrderItem(
                        rs.getInt("id"),
                        rs.getInt("order_id"),
                        rs.getInt("product_id"),
                        rs.getInt("quantity"),
                        rs.getDouble("price")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public double calculateTotalOrderPrice(int orderId) {
        double total = 0;
        String sql = "SELECT SUM(quantity * price) AS total FROM order_items WHERE order_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                total = rs.getDouble("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
}
