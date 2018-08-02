package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.payment;
import com.example.demo.repository.paymentRep;;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="http://localhost:4200",allowedHeaders = "*")
public class paymentController {
	@Autowired
	private paymentRep payRepository;
	
	@GetMapping("/userPayment")
	public List<payment> getUserPayment()
	{
		return payRepository.findAll();
	}
	
	@GetMapping("/userPayment/{id}")
	public Optional<payment> getUserPayment(@PathVariable Long id)
	{
		return payRepository.findById(id);
	}
	
	@DeleteMapping("/userPayment/{id}")
	public boolean deleteUserPayment(@PathVariable Long UserPaymentMethodId)
	{
		payRepository.deleteById(UserPaymentMethodId);
		return true;
	}

	@PostMapping("/userPayment")
	public payment createUserPayment(@RequestBody payment payment)
	{
		
		return payRepository.save(payment);
	}

	@PutMapping("/userPayment")
	public payment updateUserPayment(@RequestBody payment payment)
	{
		return payRepository.save(payment);
	}
}
