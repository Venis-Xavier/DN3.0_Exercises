package com.example.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Long>{
    Department findById(long id);
    Department findByName(String departmentName);
}
