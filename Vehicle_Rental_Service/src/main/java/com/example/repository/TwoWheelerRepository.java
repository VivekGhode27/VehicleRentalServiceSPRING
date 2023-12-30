package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.TwoWheeler;

public interface TwoWheelerRepository extends JpaRepository<TwoWheeler, Integer>{

	
}
