package com.example.employeemanagementsystem;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Table(name = "Department" )

@Entity
public class Department {

    @Id
    private Long id;
    private String name;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;

}
