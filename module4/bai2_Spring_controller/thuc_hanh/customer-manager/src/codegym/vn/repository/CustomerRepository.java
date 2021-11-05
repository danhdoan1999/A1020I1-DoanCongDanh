package codegym.vn.repository;

import codegym.vn.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> showAll();
    Customer findById(String id);
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
