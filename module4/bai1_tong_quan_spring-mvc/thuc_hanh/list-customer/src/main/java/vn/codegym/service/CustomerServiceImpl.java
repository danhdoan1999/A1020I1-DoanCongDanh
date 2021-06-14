package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.CustomerRepository;
import vn.codegym.repository.CustomerRepositoryImpl;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> listAll() {
        return customerRepository.listAll() ;
    }
}
