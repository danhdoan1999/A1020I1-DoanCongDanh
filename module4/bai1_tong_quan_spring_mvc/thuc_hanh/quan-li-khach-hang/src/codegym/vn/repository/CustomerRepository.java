package codegym.vn.repository;

import codegym.vn.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(String id);
}
