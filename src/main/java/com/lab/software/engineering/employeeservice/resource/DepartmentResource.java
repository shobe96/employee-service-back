package com.lab.software.engineering.employeeservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.software.engineering.employeeservice.domain.Department;
import com.lab.software.engineering.employeeservice.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentResource {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping
	public List<Department> findallDepartments() {
		return departmentService.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Department> getDepartment(@PathVariable Long id) {
		return departmentService.getDepartment(id);
	}
	
	@PostMapping
	public Department create(@RequestBody Department department) {
		return departmentService.create(department);
	}
	
	@PutMapping("{id}")
	public Department update(@RequestBody Department department, @PathVariable Long id) {
		return departmentService.update(department, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		departmentService.delete(id);
	}

}
