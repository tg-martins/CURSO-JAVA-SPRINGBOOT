package com.course.aulaspring.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.aulaspring.entities.Product;
import com.course.aulaspring.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	
	public Product findById(Long id) {
		Optional<Product> obj =  repository.findById(id);
		
		return obj.get();
	}
}
