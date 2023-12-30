package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TwoWheelerCategory;
import com.example.repository.TwoWheelerCategoryRepository;
import com.example.service.TwoWheelerCategoryServive;

@Service
public class TwoWheelerCategoryServiveImpl implements TwoWheelerCategoryServive{

	@Autowired
	TwoWheelerCategoryRepository twoWheelerCategoryRepository;
	
	@Override
	public TwoWheelerCategory addTwoWheelerCategory(TwoWheelerCategory twoWheelerCategory) {
		// TODO Auto-generated method stub
		return twoWheelerCategoryRepository.save(twoWheelerCategory);
	}

	@Override
	public TwoWheelerCategory updateTwoWheelerCategory(TwoWheelerCategory twoWheelerCategory) {
		TwoWheelerCategory exTwoWheelerCategory= twoWheelerCategoryRepository.findById(twoWheelerCategory.getTwowheelercategoryid()).get();
		exTwoWheelerCategory.setTwowheelercategoryname(twoWheelerCategory.getTwowheelercategoryname());
		exTwoWheelerCategory.setTwowheelercategorydescription(twoWheelerCategory.getTwowheelercategorydescription());
		
		return twoWheelerCategoryRepository.save(exTwoWheelerCategory);
	}

	@Override
	public List<TwoWheelerCategory> getAllTwoWheelerCategory() {
		// TODO Auto-generated method stub
		return twoWheelerCategoryRepository.findAll();
	}

	@Override
	public TwoWheelerCategory getTwoWheelerCategoryById(int id) {
		// TODO Auto-generated method stub
		return twoWheelerCategoryRepository.findById(id).get();
	}

	@Override
	public void deleteTwoWheelerCategory(int id) {
		// TODO Auto-generated method stub
		twoWheelerCategoryRepository.deleteById(id);
		
	}

}
