package com.example.service;

import com.example.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(String id);
    void save(Customer customer);
    void delete(Customer customer);
    Page<Customer> findAllByNameContaining(String name,Pageable pageable);
    Iterable<Customer> findALl();
}
