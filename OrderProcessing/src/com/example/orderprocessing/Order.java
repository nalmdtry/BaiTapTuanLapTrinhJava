package com.example.orderprocessing;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer customer;
    private List<Product> products;

    public Order(LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, List<Product> products) {
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.products = products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status='" + status + "', customer=" + customer + ", products=" + products + "}";
    }
}