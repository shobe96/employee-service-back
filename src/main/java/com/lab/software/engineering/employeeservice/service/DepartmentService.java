package com.lab.software.engineering.employeeservice.service;

import java.util.List;

import com.lab.software.engineering.employeeservice.domain.Department;

public interface DepartmentService {
	public List<Department> findAll();

	public Department getEmployee(int id);

	public Department create(Department department);

	public Department update(Department department);

	public void delete(int id);
}
