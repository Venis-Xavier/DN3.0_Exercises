package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String department;

}
