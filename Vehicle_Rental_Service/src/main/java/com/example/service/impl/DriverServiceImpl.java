package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Driver;
import com.example.repository.DriverRepository;
import com.example.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	DriverRepository driverRepository;
	
	
	@Override
	public Driver adddriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepository.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		
		Driver existingDriver=driverRepository.findById(driver.getDriverid()).get();
		
		existingDriver.setDriverfname(driver.getDriverfname());
		existingDriver.setDriverlname(driver.getDriverlname());
		existingDriver.setDrivergender(driver.getDrivergender());
		existingDriver.setDriverage(driver.getDriverage());
		existingDriver.setDrivercontact(driver.getDrivercontact());
		existingDriver.setDriveremail(driver.getDriveremail());
		existingDriver.setDriveraddress(driver.getDriveraddress());
		existingDriver.setDriveradharcardnumber(driver.getDriveradharcardnumber());
		existingDriver.setDriverlicensenumber(driver.getDriverlicensenumber());
		return driverRepository.save(existingDriver);
	}

	@Override
	public List<Driver> getAllDriver() {
		// TODO Auto-generated method stub
		return driverRepository.findAll();
	}

	@Override
	public Driver getDriverById(int id) {
		// TODO Auto-generated method stub
		return driverRepository.findById(id).get();
	}

	@Override
	public void deleteDriver(int id) {
		// TODO Auto-generated method stub
		driverRepository.deleteById(id);
	}

}
