package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
	
	
	
}
