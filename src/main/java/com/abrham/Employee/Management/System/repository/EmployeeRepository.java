package com.abrham.Employee.Management.System.repository;

import com.abrham.Employee.Management.System.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee , Long>{
}