package com.example.repository;


import com.example.model.AppUser;
import com.example.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
Set<UserRole> findByAppUser(AppUser appUser);
void deleteUserRoleByAppUser_Username(String username);
}
