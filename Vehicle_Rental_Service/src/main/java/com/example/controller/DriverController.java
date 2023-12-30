package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Driver;
import com.example.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	DriverService driverService;
	
	@PostMapping("/driver")
	public Driver addDriver(@RequestBody Driver driver)
	{
		return driverService.adddriver(driver);
	}
	
	@GetMapping("/drivers")
	@PreAuthorize("hasAuthority('ROLE_DRIVER')")
	public List<Driver> getAllDriver()
	{
		return driverService.getAllDriver();
	}

	@PutMapping("/driver")
	public Driver updateDriver(Driver driver)
	{
		return driverService.updateDriver(driver);
	}
	
	@DeleteMapping("/driver/{id}")
	public void deleteDriver(@PathVariable int id)
	{
		driverService.deleteDriver(id);
	}
	
	@GetMapping("/driver/{id}")
	public Driver getDriverById(int id)
	{
		return driverService.getDriverById(id);
	}
	
}
