package com.lab.software.engineering.employeeservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lab.software.engineering.employeeservice.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	
	Page<Employee> findByFirstName(String firstName, Pageable page);

}
