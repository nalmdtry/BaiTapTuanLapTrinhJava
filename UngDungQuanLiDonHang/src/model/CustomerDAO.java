package model;

import java.util.List;

public interface CustomerDAO {
    void addCustomer(Customer customer);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomers();
}

