package codegym.vn.service.Impl;

import codegym.vn.model.Customer;
import codegym.vn.repository.CustomerRepository;
import codegym.vn.repository.impl.CustomerRepositoryImpl;
import codegym.vn.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }
}
