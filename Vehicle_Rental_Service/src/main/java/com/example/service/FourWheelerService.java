package com.example.service;

import java.util.List;

import com.example.entity.FourWheeler;



public interface FourWheelerService {

	
	public FourWheeler addNewFourWheeler(FourWheeler fourWheeler);
	public FourWheeler updateFourWheeler(FourWheeler fourWheeler);
	public List<FourWheeler> getAllFourWheelers();
	public FourWheeler getfourWheelerById(int id);
	
	public void deleteFourWheeler(int id);
}
