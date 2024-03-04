package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Entities.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
