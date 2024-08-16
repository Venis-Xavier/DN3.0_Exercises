package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
        @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.department.name = :name")
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn
    private Department department;
}
