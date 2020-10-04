package com.lab.software.engineering.employeeservice.service;

import java.util.List;

import com.lab.software.engineering.employeeservice.domain.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee getEmployee(int id);
	
	public Employee create(Employee employee);
	
	public Employee update(Employee employee);
	
	public void delete(int id);
}
