package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

import com.lab.software.engineering.employeeservice.domain.Department;

public interface DepartmentService {
	public List<Department> findAll();

	public Optional<Department> getDepartment(Long id);

	public Department create(Department department);

	public Department update(Department department, Long id);

	public void delete(Long id);
}
