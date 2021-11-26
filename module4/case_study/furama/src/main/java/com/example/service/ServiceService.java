package com.example.service;

import com.example.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);
    Service findById(String id);
    void save(Service service);
    void delete(Service service);
    Page<Service> findAllByServiceNameContaining(String nameService, Pageable pageable);
    Iterable<Service> findALl();
}
