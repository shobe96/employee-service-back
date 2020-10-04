package com.lab.software.engineering.employeeservice.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.lab.software.engineering.employeeservice.constants.Gender;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	@SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1)
	private Long id;

	@Column(name = "birth_date")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDdate;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getBirthDdate() {
		return birthDdate;
	}

	public void setBirthDdate(LocalDate birthDdate) {
		this.birthDdate = birthDdate;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", birthDdate=" + birthDdate + ", firstName=" + firstName + ", last_name="
				+ last_name + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}

}
