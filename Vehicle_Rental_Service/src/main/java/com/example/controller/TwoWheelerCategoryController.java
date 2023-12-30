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

import com.example.entity.TwoWheelerCategory;
import com.example.service.TwoWheelerCategoryServive;

@RestController
//@RequestMapping("/twoWheelerCategory")
public class TwoWheelerCategoryController {

	@Autowired
	TwoWheelerCategoryServive twoWheelerCategoryServive;
	
	
	@PostMapping("/addtowWheelerCategory")
	public TwoWheelerCategory addTwoWheelerCategory( @RequestBody TwoWheelerCategory twoWheelerCategory)
	{
		return twoWheelerCategoryServive.addTwoWheelerCategory(twoWheelerCategory);
	}
	
	@PutMapping("/towWheelerCategory")
	public TwoWheelerCategory updateTwoWheelerCategory(@RequestBody TwoWheelerCategory twoWheelerCategory)
	{
		return twoWheelerCategoryServive.updateTwoWheelerCategory(twoWheelerCategory);
	}
	
	@GetMapping("/towWheelerCategorys")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<TwoWheelerCategory> getAllTwoWheelerCategory()
	{
		return twoWheelerCategoryServive.getAllTwoWheelerCategory();
	}
	
	
	@GetMapping("/towWheelerCategory/{id}")
	public TwoWheelerCategory getTwoWheelerCategoryById(@PathVariable int id)
	{
		return twoWheelerCategoryServive.getTwoWheelerCategoryById(id);
	}
	
	@DeleteMapping("/towWheelerCategory")
	public void deleteTowWheelerCategory(@PathVariable int id)
	{
		twoWheelerCategoryServive.deleteTwoWheelerCategory(id);
	}
}
