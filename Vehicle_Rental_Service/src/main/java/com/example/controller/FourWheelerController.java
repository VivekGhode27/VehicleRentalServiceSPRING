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

import com.example.entity.FourWheeler;
import com.example.service.FourWheelerService;

@RestController
@RequestMapping("/fourWheeler")
public class FourWheelerController {

	@Autowired
	FourWheelerService fourWheelerService;
	
	@PostMapping("/fourWheeler")
	public FourWheeler addFourWheeler( @RequestBody FourWheeler fourWheeler)
	{
		return fourWheelerService.addNewFourWheeler(fourWheeler);
	}
	
	@PutMapping("/fourWheeler")
	public FourWheeler updateFourWheeler( @RequestBody FourWheeler fourWheeler)
	{
		return fourWheelerService.updateFourWheeler(fourWheeler);
	}
	
	@GetMapping("fourWheelers")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public  List<FourWheeler> getAllFourWheelers()
	{
		return fourWheelerService.getAllFourWheelers();
		
	}
	
	@GetMapping("/fourWheeler/{id}")
	public  FourWheeler getFourWheelerById( @PathVariable int id) 
	{
		
		return fourWheelerService.getfourWheelerById(id);
		
	}
	
	
	@DeleteMapping("/fourWheeler/{id}")
	public  void deleteFourWheeler( @PathVariable int id) 
	{
	fourWheelerService.deleteFourWheeler(id);
	}
	
	
}
