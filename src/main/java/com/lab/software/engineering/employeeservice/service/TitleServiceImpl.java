package com.lab.software.engineering.employeeservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.software.engineering.employeeservice.domain.Title;
import com.lab.software.engineering.employeeservice.repository.TitleRepository;

@Service
@Transactional
public class TitleServiceImpl implements TitleService {
	
	@Autowired
	private TitleRepository titleRepository;

	@Override
	public List<Title> findAll() {
		return (List<Title>) titleRepository.findAll();
	}

	@Override
	public Optional<Title> getTitle(Long id) {
		return titleRepository.findById(id);
	}

	@Override
	public Title create(Title title) {
		return titleRepository.save(title);
	}

	@Override
	public Title update(Title newTitle, Long id) {
		return titleRepository.findById(id).map(title -> {
			title.setTitle(newTitle.getTitle());
			title.setFromDate(newTitle.getFromDate());
			title.setToDate(newTitle.getToDate());
			return titleRepository.save(title);
		}).orElseGet(() -> {
			newTitle.setId(id);
			return titleRepository.save(newTitle);
		});
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
