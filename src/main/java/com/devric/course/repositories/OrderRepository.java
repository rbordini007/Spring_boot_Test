package com.devric.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devric.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
