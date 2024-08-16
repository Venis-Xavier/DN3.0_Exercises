package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e WHERE e.department.name = :name")
    List<Employee> findByName(@Param("name") String Name);
}
