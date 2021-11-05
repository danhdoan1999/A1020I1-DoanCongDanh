package com.example.service.impl;

import com.example.model.Contract;
import com.example.model.Customer;
import com.example.model.Employee;
import com.example.model.Service;
import com.example.repository.ContractRepository;
import com.example.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@org.springframework.stereotype.Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(Contract contract) {
        contractRepository.delete(contract);
    }

    @Override
    public Page<Contract> findAllByEmployee_NameOrCustomer_Name(String nameEm,String nameCus, Pageable pageable) {
        return contractRepository.findAllByEmployee_NameOrCustomer_Name("%" + nameEm +"%","%"+nameCus+"%",pageable);
    }

    @Override
    public Iterable<Contract> findAll() {
        return contractRepository.findAll();
    }
}
