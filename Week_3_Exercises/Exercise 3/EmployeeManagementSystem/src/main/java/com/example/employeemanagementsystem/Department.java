package com.example.employeemanagementsystem;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@Table(name = "Department" )

@Entity
public class Department {

    @Id
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Identity", referencedColumnName = "id")
    Set<Employee> employeeSet = new HashSet<>();

}
