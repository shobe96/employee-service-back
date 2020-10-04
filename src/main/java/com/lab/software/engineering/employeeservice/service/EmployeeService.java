package com.lab.software.engineering.employeeservice.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lab.software.engineering.employeeservice.domain.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee getEmployee(int id);
	
	public Employee create(Employee employee);
	
	public Employee update(Employee employee);
	
	public void delete(int id);
	
	public Page<Employee>findByFirstName(String firstName, Pageable page);
}
