package com.example.service;

import java.util.List;


import com.example.entity.TwoWheeler;

public interface TwoWheelerService {

	public TwoWheeler addTwoWheeler(TwoWheeler twoWheeler);
	public TwoWheeler updateTwoWheeler(TwoWheeler twoWheeler);
	public List<TwoWheeler> getAllTwoWheeler();
	public TwoWheeler getTwoWheelerById(int id);
	public void deleteTwoWheeler(int id);
	
}
