package com.lab.software.engineering.employeeservice.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "departments", uniqueConstraints = {
		@UniqueConstraint(name = "departments_key", columnNames = { "dept_name" })
})
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	@SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
	@Size(max = 4, message = "Max characters for id is 14")
	private String id;
	
	@Column(name = "dept_name")
	@NotNull
	@Size(max = 40, message = "Max characters for department name is 14")
	private String deptName;
	
//	@ManyToMany
//	@JoinTable(name = "dept_emp", joinColumns = {@JoinColumn(name = "dept_id")}, inverseJoinColumns = {@JoinColumn(name = "emp_id")})
//	private List<Employee> employees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
	
	
}
