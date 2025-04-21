package com.example.orderprocessing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class OrderProcessor {

    public static void main(String[] args) {
        // Tạo dữ liệu mẫu
        Customer customer1 = new Customer(2);
        Customer customer2 = new Customer(1);
        Customer customer3 = new Customer(2);

        Product toy1 = new Product("Robot", "Toys", 25.0);
        Product book1 = new Product("Science Book", "Books", 15.0);
        Product toy2 = new Product("Doll", "Toys", 18.0);
        Product game1 = new Product("Board Game", "Games", 30.0);

        List<Product> order1Products = List.of(toy1, book1);
        List<Product> order2Products = List.of(toy2, game1);
        List<Product> order3Products = List.of(toy1, toy2);

        Order order1 = new Order(LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), "Delivered", customer1, order1Products);
        Order order2 = new Order(LocalDate.of(2021, 1, 20), LocalDate.of(2021, 1, 25), "Shipped", customer2, order2Products);
        Order order3 = new Order(LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), "Delivered", customer3, order3Products);

        List<Order> orders = List.of(order1, order2, order3);

        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        // Yêu cầu 1: Lọc các đơn hàng được đặt bởi khách hàng có tier = 2 trong khoảng thời gian từ 01/02/2021 đến 01/04/2021.
        System.out.println("Các đơn hàng của khách hàng tier 2 trong khoảng thời gian 01/02/2021 đến 01/04/2021:");
        orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .forEach(System.out::println);

        System.out.println("\n--------------------\n");

        // Yêu cầu 2: Từ các đơn hàng này, lấy ra tất cả các sản phẩm đã đặt.
        System.out.println("Các sản phẩm đã đặt từ các đơn hàng trên:");
        Set<Product> orderedProducts = new HashSet<>();
        orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())
                .forEach(orderedProducts::add);
        orderedProducts.forEach(System.out::println);

        System.out.println("\n--------------------\n");

        // Yêu cầu 3: Áp dụng giảm giá 10% cho các sản phẩm có category là "Toys".
        System.out.println("Giá các sản phẩm sau khi giảm giá 10% cho category 'Toys':");
        orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Toys"))
                .forEach(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    product.setPrice(discountedPrice);
                    System.out.println(product.getName() + " - Giá mới: " + product.getPrice());
                });

        System.out.println("\n--------------------\n");

        // Yêu cầu 4: Ghi log thông tin từng đơn hàng ra console khi xử lý (sử dụng peek()).
        System.out.println("Log thông tin từng đơn hàng khi xử lý:");
        orders.stream()
                .peek(order -> System.out.println("Đang xử lý đơn hàng: " + order))
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Toys"))
                .forEach(product -> System.out.println("Sản phẩm đồ chơi đã lọc: " + product.getName()));

        System.out.println("\n--------------------\n");

        // Yêu cầu 5: Trả về danh sách các sản phẩm đã được giảm giá, không trùng lặp.
        System.out.println("Danh sách các sản phẩm đã được giảm giá (không trùng lặp):");
        Set<Product> discountedProducts = new HashSet<>();
        orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory().equals("Toys"))
                .forEach(discountedProducts::add);
        discountedProducts.forEach(System.out::println);
    }
}