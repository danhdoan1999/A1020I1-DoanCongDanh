package com.example.service.impl;

import com.example.model.RentType;
import com.example.repository.RentTypeRepository;
import com.example.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public Iterable<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
