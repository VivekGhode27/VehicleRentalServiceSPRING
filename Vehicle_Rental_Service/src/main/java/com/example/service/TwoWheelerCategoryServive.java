package com.example.service;

import java.util.List;

import com.example.entity.TwoWheelerCategory;

public interface TwoWheelerCategoryServive {

	public TwoWheelerCategory addTwoWheelerCategory(TwoWheelerCategory twoWheelerCategory);
	public TwoWheelerCategory updateTwoWheelerCategory(TwoWheelerCategory twoWheelerCategory);
	public List<TwoWheelerCategory> getAllTwoWheelerCategory();
	public TwoWheelerCategory getTwoWheelerCategoryById(int id);
	public void deleteTwoWheelerCategory(int id);
}
