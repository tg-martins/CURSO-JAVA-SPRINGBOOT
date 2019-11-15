package com.course.aulaspring.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.aulaspring.entities.Category;
import com.course.aulaspring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	
	public Category findById(Long id) {
		Optional<Category> obj =  repository.findById(id);
		
		return obj.get();
	}
}
