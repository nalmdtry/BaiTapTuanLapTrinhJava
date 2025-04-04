package controller;

import java.util.List;

import model.Order;
import model.OrderDAO;
import model.OrderItem;

public class OrderController {
    private OrderDAO orderDAO;

    public OrderController(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public void addOrder(int customerId, List<OrderItem> items) {
        int orderId = orderDAO.addOrder(customerId, items);
        System.out.println("Đơn hàng #" + orderId + " đã được tạo!");
    }

    public void showOrderHistory(int customerId) {
        List<Order> orders = orderDAO.getOrdersByCustomerId(customerId);
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void calculateTotal(int orderId) {
        double total = orderDAO.calculateTotalOrderPrice(orderId);
        System.out.println("Tổng tiền: " + total);
    }
}
