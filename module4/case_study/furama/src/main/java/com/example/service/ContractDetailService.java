package com.example.service;

import com.example.model.ContractDetail;

public interface ContractDetailService {
    void save(ContractDetail contractDetail);
    ContractDetail findById(Integer id);
}
