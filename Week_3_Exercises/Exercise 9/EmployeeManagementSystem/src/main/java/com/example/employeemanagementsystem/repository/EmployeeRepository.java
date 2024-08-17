package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.projections.ClassBasedProjection;
import com.example.employeemanagementsystem.projections.EmployeeNameDepartmentProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    

    @Query("SELECT e FROM Employee e WHERE e.department.name = :name")
    List<Employee> findByName(@Param("name") String Name);
    @Override
    Page<Employee> findAll(Pageable pageable);

    @Query("SELECT e.name as name, d.name as departmentName FROM Employee e JOIN e.department d")
    List<EmployeeNameDepartmentProjection> findEmployeeNamesAndDepartmentNames();

    @Query("SELECT new com.example.employeemanagementsystem.projections.ClassBasedProjection(e.name, d.name) FROM Employee e JOIN e.department d")
    List<ClassBasedProjection> findClassBasedProjections();
}