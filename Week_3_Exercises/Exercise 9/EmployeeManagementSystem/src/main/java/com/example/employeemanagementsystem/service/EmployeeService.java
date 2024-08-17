package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Getter
    private final JdbcTemplate jdbcTemplate;


    public EmployeeService(EmployeeRepository employeeRepository, @Qualifier("primaryDataSource") DataSource dataSource){
        this.employeeRepository = employeeRepository;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, JdbcTemplate jdbcTemplate) {
        this.employeeRepository = employeeRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    public Page<Employee> getPaginatedEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

}
