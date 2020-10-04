package com.lab.software.engineering.employeeservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.software.engineering.employeeservice.domain.Employee;
import com.lab.software.engineering.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> findAllEmployees() {
		return employeeService.findAll();
	}
	
	@GetMapping("/search")
	public Page<Employee>findByFirstName(
			@RequestParam(value = "firstName", required = false) String firstName,
			@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "size", required = false) int size) {
		Pageable pageOptions = PageRequest.of(page, size, Sort.by("id").descending());
		return employeeService.findByFirstName(firstName, pageOptions);
	}

}
