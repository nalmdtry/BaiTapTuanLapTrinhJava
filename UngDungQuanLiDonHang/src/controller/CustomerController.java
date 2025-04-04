package controller;

import java.util.List;

import model.Customer;
import model.CustomerDAO;

public class CustomerController {
    private CustomerDAO customerDAO;

    public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
        System.out.println("Khách hàng đã được thêm!");
    }

    public void showAllCustomers() {
        List<Customer> customers = customerDAO.getAllCustomers();
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
