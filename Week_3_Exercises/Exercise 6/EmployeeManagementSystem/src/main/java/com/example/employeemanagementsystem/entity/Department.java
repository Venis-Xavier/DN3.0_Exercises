package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@NamedQueries({
        @NamedQuery(
                name = "Department.findByName",
                query = "SELECT d FROM Department d WHERE d.name = :name"
        )
})
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees;
}
