package com.course.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.aulaspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
