package com.example.repository;

import com.example.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<EducationDegree,Integer> {
}
