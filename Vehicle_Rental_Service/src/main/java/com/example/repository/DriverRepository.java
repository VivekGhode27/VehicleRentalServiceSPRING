package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer>{

	
	
}
