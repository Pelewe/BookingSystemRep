package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.users.User;
//import com.example.demo.repository.userTypeRepository;
import com.example.demo.users.UserController;


//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class usertypeController {

	/*@Autowired 
	private userTypeRepository userT;
	private UserController user;
	
	@GetMapping("/listUsers/{usertype}")
	public List<User> getAllUser(@PathVariable int usertype) {
		int type=usertype;
		List<User> allusers=user.getAllUser();
		List<User> users= new ArrayList<>();
		//users=allusers.stream().filter(t-> t.getUserType().equals(1)).collect(Collectors.toList());
		//return users;
		return allusers;
	}*/
}
