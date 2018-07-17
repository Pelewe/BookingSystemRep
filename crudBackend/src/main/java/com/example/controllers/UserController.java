package com.example.controllers;

import com.example.entities.*;
import com.example.repository.UserRepository;

//import antlr.collections.List;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
//import org.springframework.http.ResponseEntity;
//import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	/*@GetMapping("/users")
	public java.util.List<User>getUser(){
		return userRepository.findAll();
	}
	*/
	@GetMapping("/users")
	public List<User>getUser(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.getOne(id);
	}

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.deleteById(id);
		return true;
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userRepository.save(user);
	}
}
