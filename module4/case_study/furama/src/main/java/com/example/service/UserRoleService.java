package com.example.service;

import com.example.model.AppUser;
import com.example.model.UserRole;

import java.util.Set;

public interface UserRoleService {
Set<UserRole> findByAppUser(AppUser appUser);
    void deleteUserRoleByAppUser_Username(String username);
}
