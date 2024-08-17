package com.example.employeemanagementsystem.projections;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClassBasedProjection {
    private String name;
    private String departmentName;

    public ClassBasedProjection(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

}
