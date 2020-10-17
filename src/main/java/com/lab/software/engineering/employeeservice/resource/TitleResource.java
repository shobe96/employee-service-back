package com.lab.software.engineering.employeeservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.software.engineering.employeeservice.domain.Title;
import com.lab.software.engineering.employeeservice.service.TitleService;

@RestController
@RequestMapping("/api/titles")
public class TitleResource {
	
	@Autowired
	private TitleService titleService;
	
	@GetMapping
	public List<Title> findAllTitles() {
		return titleService.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Title> getTitle(@PathVariable Long id) {
		return titleService.getTitle(id);
	}
	
	@PostMapping
	public Title create(@RequestBody Title title) {
		return titleService.create(title);
	}
	
	@PutMapping("{id}")
	public Title update(@RequestBody Title title, @PathVariable Long id) {
		return titleService.update(title, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		titleService.delete(id);
	}
}
