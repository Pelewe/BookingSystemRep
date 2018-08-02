package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.bookings;
import com.example.demo.repository.bookingsRep;

public class bookingController {
	@Autowired
	 
	private bookingsRep BookingRepository;
	
	@GetMapping("/accBooking")
	public List<bookings> getAccBooking()
	{
		return BookingRepository.findAll();
	}
	
	@GetMapping("/accBooking/{accBooking_Id}")
	public Optional<bookings> getAccBooking(@PathVariable Long accBooking_Id)
	{
		return BookingRepository.findById(accBooking_Id);
	}
	
	@DeleteMapping("/accBooking/{accBooking_Id}")
	public boolean deleteAccBooking(@PathVariable Long accBooking_Id)
	{
		BookingRepository.deleteById(accBooking_Id);
		return true;
	}

	@PostMapping("/accBooking")
	public bookings createAccBooking(@RequestBody bookings accBooking)
	{
		return BookingRepository.save(accBooking);
	}

	@PutMapping("/accBooking")
	public bookings updateAccBooking(@RequestBody bookings accBooking)
	{
		return BookingRepository.save(accBooking);
	}
	
}
