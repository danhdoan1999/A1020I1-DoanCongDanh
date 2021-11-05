package com.example.service;

import com.example.model.EducationDegree;

public interface EducationService {
    Iterable<EducationDegree> findAll();
}
