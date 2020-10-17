package com.lab.software.engineering.employeeservice.domain;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lab.software.engineering.employeeservice.constants.Gender;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "birth_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;

	@Column(name = "first_name")
	@NotNull
	@Size(max = 14, message = "Max characters for first name is 14")
	private String firstName;

	@Column(name = "last_name")
	@NotNull
	@Size(max = 16, message = "Max characters for first name is 16")
	private String last_name;

	@Column(name = "gender")
	@NotNull
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "hire_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hireDate;

	@ManyToMany(mappedBy = "employees")
	private Set<Department> departments;
	
	@OneToMany(mappedBy = "emp")
	private Set<Title> titles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getBirthDdate() {
		return birthDate;
	}

	public void setBirthDdate(LocalDate birthDdate) {
		this.birthDate = birthDdate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", birthDate=" + birthDate + ", firstName=" + firstName + ", last_name="
				+ last_name + ", gender=" + gender + ", hireDate=" + hireDate + ", departments=" + departments
				+ ", titles=" + titles + "]";
	}

}
