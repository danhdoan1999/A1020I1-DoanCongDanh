package com.example.repository;

import com.example.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractRepository extends JpaRepository<Contract,Integer> {
    @Query("SELECT e FROM Contract e WHERE e.employee.name like ?1 OR e.customer.name LIKE ?2 or e.service.serviceName like ?3")
    Page<Contract> findAllByEmployee_NameOrCustomer_NameOrService_Name(String nameEm, String nameCus,String nameSer, Pageable pageable);
}
