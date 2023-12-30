package com.example.service;

import java.util.List;

import com.example.entity.Booking;



public interface BookingService {

	
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking);
	public List<Booking> getAllBooking();
	public Booking getBookingById(int id);
	public void deleteBooking(int id);
	public String BookingAmount(Booking booking);
	

}
