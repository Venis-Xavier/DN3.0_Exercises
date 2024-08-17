package com.example.employeemanagementsystem.projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeNameDepartmentProjection {

    @Value("#{target.name + ' (' + target.department.name + ')'}")
    String getFormattedNameAndDepartment();
}
