package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Department>) departmnetRepository.findAll();
	}

	@Override
	public Optional<Department> getDepartment(Long id) {
		return departmnetRepository.findById(id);
	}

	@Override
	public Department create(Department department) {
		return departmnetRepository.save(department);
	}

	@Override
	public Department update(Department newDepartment, Long id) {
		return departmnetRepository.findById(id).map(department -> {
			department.setDeptName(newDepartment.getDeptName());
			return departmnetRepository.save(department);
		}).orElseGet(() -> {
			newDepartment.setId(id);
			return departmnetRepository.save(newDepartment);
		});
	}

	@Override
	public void delete(Long id) {
		departmnetRepository.deleteById(id);

	}

}
