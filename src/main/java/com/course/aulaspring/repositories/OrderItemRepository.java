package com.course.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.aulaspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
