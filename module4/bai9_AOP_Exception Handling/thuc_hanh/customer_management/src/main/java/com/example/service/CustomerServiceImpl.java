package com.example.service;

import com.example.exception.DuplicateEmailException;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) throws DuplicateEmailException {
        try{
            customerRepository.save(customer);
        }catch (DataIntegrityViolationException e){
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void remove(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }
}
