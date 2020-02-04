package com.devric.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devric.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
