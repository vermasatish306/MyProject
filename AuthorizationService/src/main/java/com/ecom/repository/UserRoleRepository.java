package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}
