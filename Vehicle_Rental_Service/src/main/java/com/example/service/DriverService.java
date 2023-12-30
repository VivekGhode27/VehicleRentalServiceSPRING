package com.example.service;

import java.util.List;

import com.example.entity.Driver;

public interface DriverService {

	public Driver adddriver(Driver driver);
	public Driver updateDriver(Driver driver);
	public List<Driver> getAllDriver();
	public Driver getDriverById(int id);
	public void deleteDriver(int id);
}
