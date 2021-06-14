package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> listAll();
}
