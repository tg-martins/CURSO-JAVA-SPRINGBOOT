package com.course.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.aulaspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
