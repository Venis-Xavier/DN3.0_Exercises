package com.example.employeemanagementsystem;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Table(name = "Employee")

@Entity
public class Employee {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private String email;
    private String department;

}
