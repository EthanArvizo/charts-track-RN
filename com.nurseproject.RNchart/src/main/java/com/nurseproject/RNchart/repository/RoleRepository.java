package com.nurseproject.RNchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nurseproject.RNchart.model.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
