package com.lab.software.engineering.employeeservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lab.software.engineering.employeeservice.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{

}
