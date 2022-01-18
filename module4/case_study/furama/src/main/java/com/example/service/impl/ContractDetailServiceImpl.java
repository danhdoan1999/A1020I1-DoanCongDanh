package com.example.service.impl;

import com.example.model.ContractDetail;
import com.example.repository.ContractDetailRepository;
import com.example.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;
    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public Page<ContractDetail> findAllByCustomer_NameOrCustomer_CustomerId(String nameCus, String idCus, Pageable pageable) {
        return contractDetailRepository.findAllByCustomer_NameOrCustomer_CustomerId(nameCus,idCus,pageable);
    }

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

}
