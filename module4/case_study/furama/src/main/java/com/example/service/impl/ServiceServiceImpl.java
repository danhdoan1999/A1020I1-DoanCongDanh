package com.example.service.impl;

import com.example.model.Service;
import com.example.repository.ServiceRepository;
import com.example.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Service findById(String id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(Service service) {
        serviceRepository.delete(service);
    }

    @Override
    public Page<Service> findAllByServiceNameContaining(String nameService, Pageable pageable) {
        return serviceRepository.findAllByServiceNameContaining(nameService,pageable);
    }

    @Override
    public Iterable<Service> findALl() {
        return serviceRepository.findAll();
    }
}
