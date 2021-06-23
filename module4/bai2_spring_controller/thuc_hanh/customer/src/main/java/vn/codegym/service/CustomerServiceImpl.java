package vn.codegym.service;

import vn.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerService customerService = new CustomerServiceImpl();

    @Override
    public List<Customer> finAll() {
        return customerService.finAll();
    }

    @Override
    public Customer findById(int id) {
        return customerService.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerService.save(customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customerService.update(id,customer);
    }
}
