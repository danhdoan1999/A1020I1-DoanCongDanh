package com.example.repository;

import com.example.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,String> {
    Page<Service> findAllByServiceNameContaining(String nameService, Pageable pageable);
}
