package com.lab.software.engineering.employeeservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.software.engineering.employeeservice.domain.Department;
import com.lab.software.engineering.employeeservice.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmnetRepository;

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return (List<Department>) departmnetRepository.findAll();
	}

	@Override
	public Department getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department create(Department employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department update(Department employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
