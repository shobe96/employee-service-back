package com.lab.software.engineering.employeeservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.software.engineering.employeeservice.domain.Department;
import com.lab.software.engineering.employeeservice.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentResource {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departments")
	public List<Department> findallDepartments() {
		return departmentService.findAll();
	}

}
