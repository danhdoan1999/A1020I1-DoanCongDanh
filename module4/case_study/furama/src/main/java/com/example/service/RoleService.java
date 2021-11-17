package com.example.service;

import com.example.model.AppRole;

import java.util.List;

public interface RoleService {
    List<AppRole> findAll();
    AppRole findById(int id);
}
