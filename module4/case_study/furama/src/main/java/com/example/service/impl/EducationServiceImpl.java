package com.example.service.impl;

import com.example.model.EducationDegree;
import com.example.repository.EducationRepository;
import com.example.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    EducationRepository educationRepository;
    @Override
    public Iterable<EducationDegree> findAll() {
        return educationRepository.findAll();
    }
}
