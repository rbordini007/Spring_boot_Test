package com.devric.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devric.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
