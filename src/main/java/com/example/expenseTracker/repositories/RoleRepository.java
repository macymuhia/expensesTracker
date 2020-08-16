package com.example.expenseTracker.repositories;

import com.example.expenseTracker.entities.ERole;
import com.example.expenseTracker.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
