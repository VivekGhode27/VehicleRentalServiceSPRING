package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.FourWheelerCategory;
import com.example.repository.FourWheelerCategoryRepository;
import com.example.repository.FourWheelerRepository;
import com.example.service.FourWheelerCategoryService;

@Service
public class FourWheelerCategoryServiceImpl implements FourWheelerCategoryService{

	@Autowired
	FourWheelerCategoryRepository fourWheelerCategoryRepository;

	@Override
	public FourWheelerCategory addNewFourWheelerCategory(FourWheelerCategory fourWheelerCategory) {
		// TODO Auto-generated method stub
		return fourWheelerCategoryRepository.save(fourWheelerCategory);
	}

	@Override
	public FourWheelerCategory updateFourWheelerCategory(FourWheelerCategory fourWheelerCategory)
	{
		FourWheelerCategory  exfourWheelerCategory=fourWheelerCategoryRepository.findById(fourWheelerCategory.getFourwheelercategoryid()).get();
		exfourWheelerCategory.setFourwheelercategoryname(fourWheelerCategory.getFourwheelercategoryname());
		exfourWheelerCategory.setFourwheelercategorydescription(fourWheelerCategory.getFourwheelercategorydescription());
		
		
		return fourWheelerCategoryRepository.save(exfourWheelerCategory);
	}

	@Override
	public List<FourWheelerCategory> getAllFourWheelerCategory() {
		// TODO Auto-generated method stub
		return fourWheelerCategoryRepository.findAll();
	}

	@Override
	public FourWheelerCategory getFourWheelerCategoryById(int id) {
		// TODO Auto-generated method stub
		
		return fourWheelerCategoryRepository.findById(id).get();
	}

	@Override
	public void deleteFourWheelerCategory( int id) {
		// TODO Auto-generated method stub
		fourWheelerCategoryRepository.deleteById(id);
	}
	
	
	
}
