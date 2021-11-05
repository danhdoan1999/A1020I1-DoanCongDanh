package codegym.vn.service;

import codegym.vn.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    Customer update(int id,Customer customer);
    void delete(Customer customer);
}
