package model;

import java.util.List;

public interface OrderDAO {
    int addOrder(int customerId, List<OrderItem> items);
    List<Order> getOrdersByCustomerId(int customerId);
    double calculateTotalOrderPrice(int orderId);
}
