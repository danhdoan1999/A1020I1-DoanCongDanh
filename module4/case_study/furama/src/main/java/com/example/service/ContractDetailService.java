package com.example.service;

import com.example.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractDetailService {
    void save(ContractDetail contractDetail);
    Page<ContractDetail> findAllByCustomer_NameOrCustomer_CustomerId(String nameCus, String idCus , Pageable pageable);
    Page<ContractDetail> findAll(Pageable pageable);
}
