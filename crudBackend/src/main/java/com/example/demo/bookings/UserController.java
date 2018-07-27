/*package com.example.demo.bookings;

import com.example.entities.*;
import com.example.services.UserService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




//@RequestMapping("/api")
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
public class UserController {
	 @Autowired
	private UserService userService;
	 
	 @RequestMapping("/hello")
	 public String sayHi() {
		 return "HI";
	 }
	 
	@RequestMapping("/users")
	public List<User>getUser(){
		return userService.getUser();
	}
	
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userService.getUser(id);
	}

	@RequestMapping(method=RequestMethod.DELETE,value=("/user/{id}"))
	public boolean deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/user"))
	public void updateUser(@RequestBody User user){
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value= "/user")
	public void createUser(@RequestBody User user){
		userService.createUser(user);
	}
	
	
	
	
	/* @Autowired
	private UserRepository userRepository;
	
	/*@GetMapping("/users")
	public java.util.List<User>getUser(){
		return userRepository.findAll();
	}
	
	
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
	*/
