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

import com.example.entity.FourWheelerCategory;
import com.example.service.FourWheelerCategoryService;

@RestController
//@RequestMapping("/user")
public class FourWheelerCategoryController {

	@Autowired
	FourWheelerCategoryService fourWheelerCategoryService;
	
	@PostMapping("/addfourWheelerCategory")
	public FourWheelerCategory addNewFourWheelerCategory(@RequestBody FourWheelerCategory fourWheelerCategory)
	{
		return fourWheelerCategoryService.addNewFourWheelerCategory(fourWheelerCategory);
	}
	
	@PutMapping("/fourWheelerCategory")
	public FourWheelerCategory updateFourWheelerCategory( @RequestBody FourWheelerCategory fourWheelerCategory) 
	{
		
		return fourWheelerCategoryService.updateFourWheelerCategory(fourWheelerCategory);
	}
	
	@GetMapping("/fourWheelerCategorys")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<FourWheelerCategory> findAllFourWheelerCategories()
	{
		
		return fourWheelerCategoryService.getAllFourWheelerCategory();
	}
	
	@GetMapping("/fourWheelerCategory/{id}")
	public FourWheelerCategory getFourWheelerCategoryById( @PathVariable int  id) 
	{
		return fourWheelerCategoryService.getFourWheelerCategoryById(id);
	}
	
	@DeleteMapping("/fourWheelerCategory/{id}")
	public void deleteFourWheelerCategory( @PathVariable int id)
	{
	fourWheelerCategoryService.deleteFourWheelerCategory(id);
	}
	
}
