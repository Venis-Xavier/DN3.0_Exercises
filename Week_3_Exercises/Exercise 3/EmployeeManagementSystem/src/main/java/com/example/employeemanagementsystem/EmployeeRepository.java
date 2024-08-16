package com.example.employeemanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findById(long id);
    Employee findByName(String name);
    Employee findByEmail(String email);
    Employee findByDepartment(String department);
}
