package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

import com.lab.software.engineering.employeeservice.domain.Title;

public interface TitleService {
	public List<Title> findAll();

	public Optional<Title> getTitle(Long id);

	public Title create(Title title);

	public Title update(Title title, Long id);

	public void delete(Long id);
}
