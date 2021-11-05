package codegym.vn.service;

import codegym.vn.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> showAll();
    Customer findById(String id);
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
