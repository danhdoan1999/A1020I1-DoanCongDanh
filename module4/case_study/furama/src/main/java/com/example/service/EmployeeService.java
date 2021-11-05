package com.example.service;

import com.example.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Page<Employee> findAll(Pageable pageable);

    Employee findById(String id);

    void save(Employee employee);

    void delete(Employee employee);

    Page<Employee> findAllByNameContaining(String name,Pageable pageable);

    Iterable<Employee> findAll();
}
