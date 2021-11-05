package com.example.service.impl;

import com.example.model.AttachService;
import com.example.repository.AttachServiceRepository;
import com.example.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    private AttachServiceRepository attachServiceRepository;
    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
