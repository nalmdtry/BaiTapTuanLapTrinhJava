package test;

import controller.OrderController;
import controller.CustomerController;
import model.CustomerDAOImpl;
import model.CustomerDAO;
import model.OrderDAO;
import model.OrderDAOImpl;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAOImpl();

        OrderDAO orderDAO = new OrderDAOImpl();

        CustomerController customerController = new CustomerController(customerDAO);
        OrderController orderController = new OrderController(orderDAO);

        while (true) {
            int choice = MainView.showMenu();
            if (choice == 0) break;

            switch (choice) {
                case 1:
                    int customerId = MainView.getInput("Nhập ID khách hàng: ");
                    // Thêm sản phẩm vào đơn hàng...
                    break;
                case 2:
                    orderController.showOrderHistory(MainView.getInput("Nhập ID khách hàng: "));
                    break;
                case 3:
                    orderController.calculateTotal(MainView.getInput("Nhập ID đơn hàng: "));
                    break;
            }
        }
    }
}



