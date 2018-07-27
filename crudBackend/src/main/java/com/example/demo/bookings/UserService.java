/*package com.example.demo.bookings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.entities.*;
//import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
  //@Autowired
	//private UserRepository userRepository;
	
	private List<User> users=new ArrayList<>(Arrays.asList(
	new User("one", "one", "one@gmail.com", "0724586111","1234567889"),
	new User("two", "two", "two@gmail.com", "0824586111","123456789")
	));
	
	public List<User>getUser(){
		return users;		
	}
	
	public User getUser(Long id){
		
		return users.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		//return userRepository.getOne(id);
	}

	public boolean deleteUser( Long id){
		users.removeIf(t-> t.getId().equals(id));
		return true;
	}
	
	
	public void updateUser( User user){
		/*for(int i=0;i<users.size(); i++) {
			User t =users.get(i);
			if(t.getId().equals(id)) {
				users.set(i, User);
			}
		} 
		
	}
	
	
	public void createUser( User user){
		users.add(user);
		
	}
		
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
	} */

