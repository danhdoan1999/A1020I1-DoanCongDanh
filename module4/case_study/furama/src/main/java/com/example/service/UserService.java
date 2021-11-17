package com.example.service;

import com.example.model.AppUser;

public interface UserService {
    Iterable<AppUser> findAll();
    AppUser findByUsername(String username);
}
