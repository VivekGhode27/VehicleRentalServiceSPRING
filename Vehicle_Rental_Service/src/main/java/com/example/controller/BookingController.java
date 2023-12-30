package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Booking;
import com.example.service.BookingService;

@RestController
//@RequestMapping("/booking")
public class BookingController  {

	@Autowired
	BookingService bookingService;
	
	
	@PostMapping("/bookings")
	public Booking addBooking(@RequestBody Booking booking )
	{
		return bookingService.addBooking(booking);
	}
	
	@GetMapping("/bookings")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Booking> getAllBooking()
	{
		return bookingService.getAllBooking();
		
	}
	
	@GetMapping("/booking/{id}")
	public Booking getBookingById(@PathVariable int  id)
	{
		return bookingService.getBookingById(id);
	}
	
	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking)
	{
		return bookingService.updateBooking(booking);
	}
	
	@DeleteMapping("/booking/{id}")
	public void deleteBooking(@PathVariable int id)
	{
		bookingService.deleteBooking(id);
	}
	
}
