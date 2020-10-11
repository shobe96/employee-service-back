package com.lab.software.engineering.employeeservice.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departments", uniqueConstraints = {
		@UniqueConstraint(name = "departments_key", columnNames = { "dept_name" })
})
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dept_name")
	@NotNull
	@Size(max = 40, message = "Max characters for department name is 14")
	private String deptName;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = Employee.class)
	@JoinTable(name = "dept_emp", joinColumns = {@JoinColumn(name = "dept_id")}, inverseJoinColumns = {@JoinColumn(name = "emp_id")})
	@JsonIgnore
	private Set<Employee> employees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
