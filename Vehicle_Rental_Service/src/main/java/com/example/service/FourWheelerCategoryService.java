package com.example.service;

import java.util.List;


import com.example.entity.FourWheelerCategory;

public interface FourWheelerCategoryService {

	public FourWheelerCategory addNewFourWheelerCategory(FourWheelerCategory fourWheelerCategory);
	public FourWheelerCategory updateFourWheelerCategory(FourWheelerCategory fourWheelerCategory);
	public List<FourWheelerCategory> getAllFourWheelerCategory();
	public FourWheelerCategory getFourWheelerCategoryById(int id);
	
	public void deleteFourWheelerCategory(int id);
	
}
