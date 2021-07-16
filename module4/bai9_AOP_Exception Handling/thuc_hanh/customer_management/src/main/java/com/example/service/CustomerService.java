package com.example.service;

import com.example.exception.DuplicateEmailException;
import com.example.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Customer findById(int id);

    void save(Customer customer) throws DuplicateEmailException;

    void remove(Customer customer);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
