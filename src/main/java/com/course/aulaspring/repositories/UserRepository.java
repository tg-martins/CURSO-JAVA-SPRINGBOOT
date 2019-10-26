package com.course.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.aulaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
