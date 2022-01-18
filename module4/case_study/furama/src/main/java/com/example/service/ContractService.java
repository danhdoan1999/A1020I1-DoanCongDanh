package com.example.service;

import com.example.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);
    Contract findById(Integer id);
    void save(Contract contract);
    void delete(Contract contract);
    Page<Contract> findAllByEmployee_NameOrCustomer_NameOrService_Name(String nameEm,String nameCus,String nameSer, Pageable pageable);
    Iterable<Contract> findAll();
}
