package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.FourWheeler;
import com.example.repository.FourWheelerRepository;
import com.example.service.FourWheelerService;

@Service// for logic part 
public class FourWheelerServiceImpl implements FourWheelerService {
    @Autowired
	FourWheelerRepository fourWheelerRepository;
	
	
	@Override
	public FourWheeler addNewFourWheeler(FourWheeler fourWheeler) {
		// TODO Auto-generated method stub
		return fourWheelerRepository.save(fourWheeler);
	}

	@Override
	public FourWheeler updateFourWheeler(FourWheeler fourWheeler) {
		// TODO Auto-generated method stub
		FourWheeler exFourWheeler=fourWheelerRepository.findById(fourWheeler.getFourwheelerid()).get();
		
		exFourWheeler.setFourwheelename(fourWheeler.getFourwheelename());
		exFourWheeler.setFourwheeleOwnername(fourWheeler.getFourwheeleOwnername());
		exFourWheeler.setFourwheeleregistrationnumber(fourWheeler.getFourwheeleregistrationnumber());
		exFourWheeler.setFourwheelediscription(fourWheeler.getFourwheelediscription());
		exFourWheeler.setFourwheelefueltype(fourWheeler.getFourwheelefueltype());
		exFourWheeler.setFourwheelegeartype(fourWheeler.getFourwheelegeartype());
		exFourWheeler.setFourwheelecolor(fourWheeler.getFourwheelecolor());
		exFourWheeler.setCarrph(fourWheeler.getCarrph());
		return fourWheelerRepository.save(exFourWheeler);
	}

	@Override
	public List<FourWheeler> getAllFourWheelers() {
		// TODO Auto-generated method stub
		return fourWheelerRepository.findAll();
	}
	
	

	@Override
	public FourWheeler getfourWheelerById(int id) {
		// TODO Auto-generated method stub
		return fourWheelerRepository.findById(id).get();
	}

	@Override
	public void deleteFourWheeler(int id) {
		// TODO Auto-generated method stub
		fourWheelerRepository.deleteById(id);
		
	}

}
