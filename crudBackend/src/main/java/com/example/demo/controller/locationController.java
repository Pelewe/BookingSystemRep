package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.example.demo.methods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.location;
import com.example.demo.repository.locationRep;

@RestController
@RequestMapping("/location")
public class locationController {
	 @Autowired
	private locationRep locatRep;
	
	 private methods met;
	@GetMapping
	public List<location>getAllLocations(){
		List<location>users = new ArrayList<>();
		  locatRep.findAll().forEach(users::add);
		 return users;
	}
	
	@GetMapping("/{id}")
	public Optional<location> getlocation(@PathVariable("id") int id){
		//return locatRep.getOne(id);
		return locatRep.findById(id);
		
	}
	
	@GetMapping("/loco/{province}")
	public List<location> getProvincelocation(@PathVariable("province") String province){
		//province=met.upperFirst(province);
		//String prove=province;
		List<location> locations=new ArrayList<>();
		List<location> Alllocations=(List<location>) locatRep.findAll();
		locations=(List<location>) Alllocations.stream().filter(t->t.getProvince().equals(province)).collect(Collectors.toList());
		
		return locations;
	}
	@GetMapping("/loco/{province}/{city}")
	public List<location> getProvincelocation(@PathVariable("province") String province,@PathVariable("province") String city){
		///met.upperFirst(province);
		//met.upperFirst(city);
		
		List<location> locations=new ArrayList<>();
		List<location> Alllocations=(List<location>) locatRep.findAll();
		locations=(List<location>) Alllocations.stream().filter(t->t.getProvince().equals(province) && t.getCity().equals(city)).collect(Collectors.toList());
		
		
		return locations;
	}
	
	@DeleteMapping("{id}")
	public boolean deleteLocation(@PathVariable("id") int id){
		locatRep.deleteById(id);
		return true;
	}
	
	@PutMapping
	public location updateLocation(@RequestBody location location){
		return locatRep.save(location);
	}
	
	@PostMapping
	public location createUser(@RequestBody location location){
		return locatRep.save(location);
	}
}
