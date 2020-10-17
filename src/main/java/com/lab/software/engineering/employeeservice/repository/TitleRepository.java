package com.lab.software.engineering.employeeservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lab.software.engineering.employeeservice.domain.Title;

public interface TitleRepository extends PagingAndSortingRepository<Title, Long>{

}
