package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lab.software.engineering.employeeservice.domain.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Optional<Employee> getEmployee(Long id);
	
	public Employee create(Employee employee);
	
	public Employee update(Employee employee, Long id);
	
	public void delete(Long id);
	
	public Page<Employee>findByFirstName(String firstName, Pageable page);
}
