package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , String> {
    Page<Employee> findAllByNameContaining(String name,Pageable pageable);
}
