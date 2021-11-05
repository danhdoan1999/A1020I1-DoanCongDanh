package codegym.vn.repository;

import codegym.vn.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    Customer update(int id,Customer customer);
    void delete(Customer customer);
}
