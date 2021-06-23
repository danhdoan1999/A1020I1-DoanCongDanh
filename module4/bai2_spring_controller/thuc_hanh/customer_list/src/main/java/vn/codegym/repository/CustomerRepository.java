package vn.codegym.repository;

import vn.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerRepository {
    List<Customer> finAll();
    Customer findById(int id);
    void save(Customer customer);
    void update(int id, Customer customer);
}
