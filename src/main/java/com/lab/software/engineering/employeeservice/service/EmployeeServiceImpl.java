package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lab.software.engineering.employeeservice.domain.Employee;
import com.lab.software.engineering.employeeservice.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee update(Employee newEmployee, Long id) {
		return employeeRepository.findById(id).map(employee -> {
			employee.setFirstName(newEmployee.getFirstName());
			employee.setLast_name(newEmployee.getLast_name());
			employee.setGender(newEmployee.getGender());
			employee.setBirthDdate(newEmployee.getBirthDdate());
			employee.setHireDate(newEmployee.getHireDate());
			return employeeRepository.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return employeeRepository.save(newEmployee);
		});
	}

	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public Page<Employee> findByFirstName(String firstName, Pageable page) {
		return employeeRepository.findByFirstName(firstName, page);
	}

}
