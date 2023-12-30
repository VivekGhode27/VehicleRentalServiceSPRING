package com.example.service.impl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Booking;
import com.example.repository.BookingRepository;
import com.example.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		Booking existingBooking=bookingRepository.findById(booking.getBid()).get();
		existingBooking.setAddress(booking.getAddress());
		existingBooking.setAdharNumber(booking.getAdharNumber());
		existingBooking.setChildSeat(booking.getChildSeat());
		existingBooking.setCity(booking.getCity());
		existingBooking.setCountry(booking.getCountry());
		existingBooking.setDob(booking.getDob());
		existingBooking.setGender(booking.getGender());
		existingBooking.setPincode(booking.getPincode());
		existingBooking.setState(booking.getState());
		existingBooking.setLicense_number(booking.getLicense_number());
		existingBooking.setStartdate(booking.getStartdate());
		existingBooking.setEnddate(booking.getEnddate());
		return bookingRepository.save(existingBooking);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(int id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id).get();
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}

	@Override
	public String BookingAmount(Booking booking) {
		Booking booking1=bookingRepository.findById(booking.getBid()).get();
		Date sdate=booking1.getStartdate();
		Date edate=booking1.getEnddate();
		long diffmilisecond=sdate.getTime()-edate.getTime();
	 	
		
		long daysdifference= TimeUnit.MILLISECONDS.toDays(diffmilisecond);
		
		return null;
	}

}
