package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TwoWheeler;
import com.example.repository.TwoWheelerRepository;
import com.example.service.TwoWheelerService;

@Service
public class TwoWheelerServiceImpl implements TwoWheelerService {

	@Autowired
	TwoWheelerRepository twoWheelerRepository;
	
	
	@Override
	public TwoWheeler addTwoWheeler(TwoWheeler twoWheeler) {
		
		return twoWheelerRepository.save(twoWheeler);
	}

	@Override
	public TwoWheeler updateTwoWheeler(TwoWheeler twoWheeler) {
	TwoWheeler existingtowWheeler=	twoWheelerRepository.findById(twoWheeler.getTwowheelereid()).get();
	existingtowWheeler.setTwowheelerename(twoWheeler.getTwowheelerename());
	existingtowWheeler.setTwowheelereOwnername(twoWheeler.getTwowheelereOwnername());
	existingtowWheeler.setTwowheelerregistrationnumber(twoWheeler.getTwowheelerregistrationnumber());
	existingtowWheeler.setTwowheelercolor(twoWheeler.getTwowheelercolor());
	existingtowWheeler.setTwowheelerdiscription(twoWheeler.getTwowheelerdiscription());
	existingtowWheeler.setTwowheelerrph(twoWheeler.getTwowheelerrph());
	
	return twoWheelerRepository.save(existingtowWheeler);
	}

	@Override
	public List<TwoWheeler> getAllTwoWheeler() {
		// TODO Auto-generated method stub
		return twoWheelerRepository.findAll();
	}

	@Override
	public TwoWheeler getTwoWheelerById(int id) {
		// TODO Auto-generated method stub
		return twoWheelerRepository.findById(id).get();
	}

	@Override
	public void deleteTwoWheeler(int id) {
		// TODO Auto-generated method stub
		twoWheelerRepository.deleteById(id);
	}

}
