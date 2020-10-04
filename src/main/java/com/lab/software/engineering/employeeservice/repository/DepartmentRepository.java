package com.lab.software.engineering.employeeservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lab.software.engineering.employeeservice.domain.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, String>{

}
