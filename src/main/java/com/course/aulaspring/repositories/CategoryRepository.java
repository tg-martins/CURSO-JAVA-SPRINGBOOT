package com.course.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.aulaspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
