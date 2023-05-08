package com.pedrocpacheco.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocpacheco.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
