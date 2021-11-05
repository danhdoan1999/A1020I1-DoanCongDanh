package com.example.repository;

import com.example.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractRepository extends JpaRepository<Contract,Integer> {
    @Query("SELECT e FROM Contract e WHERE e.employee.name like ?1 OR e.customer.name LIKE ?2")
    Page<Contract> findAllByEmployee_NameOrCustomer_Name(String nameEm, String nameCus, Pageable pageable);
}
