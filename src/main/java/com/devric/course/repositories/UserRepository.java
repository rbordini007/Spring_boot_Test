package com.devric.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devric.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
