package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TwoWheeler;
import com.example.service.TwoWheelerService;

@RestController
@RequestMapping("/twoWheeler")
public class TwoWheelerController {

	@Autowired
	TwoWheelerService twoWheelerService;
	
	@PostMapping("/addtwoWheeler")
	public TwoWheeler addTwoWheeler(@RequestBody TwoWheeler twoWheeler)
	{
		return twoWheelerService.addTwoWheeler(twoWheeler);
	}
	
	@PutMapping("/twoWheeler")
	public TwoWheeler updateTwoWheeler(@RequestBody TwoWheeler twoWheeler)
	{
		return twoWheelerService.updateTwoWheeler(twoWheeler);
		
	}
	
	@GetMapping("twoWheelers")
	public List<TwoWheeler> getAllTwoWheeler()
	{
		return twoWheelerService.getAllTwoWheeler();
	}
	
	
	@GetMapping("twoWheeler/{id}")
	public TwoWheeler getTwoWheelerById(@PathVariable int id)
	{
		return twoWheelerService.getTwoWheelerById(id);
	}
	
	@DeleteMapping("/twoWheeler/{id}")
	public void deleteTwoWheeler(int id)
	{
		twoWheelerService.deleteTwoWheeler(id);
	}
}
