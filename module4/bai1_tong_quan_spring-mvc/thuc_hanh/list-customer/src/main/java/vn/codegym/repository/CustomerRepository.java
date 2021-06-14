package vn.codegym.repository;

import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

import java.util.List;
@Service
public interface CustomerRepository {
List<Customer> listAll();
}
