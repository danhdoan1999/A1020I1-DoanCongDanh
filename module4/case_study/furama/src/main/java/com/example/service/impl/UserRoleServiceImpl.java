package com.example.service.impl;


import com.example.model.AppUser;
import com.example.model.UserRole;
import com.example.repository.UserRoleRepository;
import com.example.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public Set<UserRole> findByAppUser(AppUser appUser) {
        return userRoleRepository.findByAppUser(appUser);
    }

    @Override
    public void deleteUserRoleByAppUser_Username(String username) {
        userRoleRepository.deleteUserRoleByAppUser_Username(username);
    }
}
