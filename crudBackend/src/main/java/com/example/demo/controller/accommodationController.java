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

import com.example.demo.model.accomodation;
import com.example.demo.repository.accomodationRep;



@RestController
@RequestMapping("/api/accomodation")
@CrossOrigin(origins ="http://localhost:4200",allowedHeaders = "*")

public class accommodationController {
	@Autowired
	 
	private accomodationRep propertyRepository;
	
	@GetMapping("/property")
	public List<accomodation> getProperty()
	{
		return (List<accomodation>) propertyRepository.findAll();
	}
	
	@GetMapping("/property/{prob_Id}")
	public Optional<accomodation> getProperty(@PathVariable Long prob_Id)
	{
		return propertyRepository.findById(prob_Id);
	}
	
	@DeleteMapping("/property/{prob_Id}")
	public boolean deleteProperty(@PathVariable Long prob_Id)
	{
		propertyRepository.deleteById(prob_Id);
		return true;
	}

	@PostMapping("/property")
	public accomodation createProperty(@RequestBody accomodation property)
	{
		
		return propertyRepository.save(property);
	}

	@PutMapping("/property")
	public accomodation updateProperty(@RequestBody accomodation property)
	{
		return propertyRepository.save(property);
	}
}
