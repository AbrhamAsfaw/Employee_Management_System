package com.abrham.Employee.Management.System.service;

import com.abrham.Employee.Management.System.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
