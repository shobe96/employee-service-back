package com.lab.software.engineering.employeeservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.software.engineering.employeeservice.domain.Employee;
import com.lab.software.engineering.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		return employeeService.findAll();
	}

}
