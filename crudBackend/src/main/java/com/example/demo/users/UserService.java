package com.example.demo.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.repository.UserRepository;

//import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	/*private List<User> users=new ArrayList<>(Arrays.asList(
	new User("one", "one", "one@gmail.com", "0724586111","1234567889"),
	new User("two", "two", "two@gmail.com", "0824586111","123456789")
	));*/
	
	
	public List<User>getAllUser(){
		
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		
		return users;
		//return userRepository.findAll();
	}
	
	public Optional<User> getUser(@PathVariable Long id){
	return userRepository.findById(id);
		//return users.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		
	}
	
	public List<User> searchUser(@PathVariable String name){
		
			List<User> customers = new ArrayList<>();
			List<User> user=new ArrayList<>();
	        
			user=(List<User>) user.stream().filter(t-> t.getLname().equals(name)).collect(Collectors.toList());
			
			
			/* for(int i=0; i<userRepository.count() ;i++) {
				
				if(userRepository.getClass(). =name) {
					user.add();
				}
			}
			*/
			//userRepository.findBylname(name).forEach(user::add);
					
			return user;
		}

	public boolean deleteUser( Long id){
		//users.removeIf(t-> t.getId().equals(id));
		userRepository.deleteById(id);
		return true;
	}
	
	
	public void updateUser( User user){
		 userRepository.save(user);
	}
	
	public void createUser( User user){
		userRepository.save(new User(user.getFname(),user.getLname(),user.getEmail(),user.getPhoneNo(), user.getPassword()));
	}
	/*public void createUser( User user){
		userRepository.save(new User(user.getEmail(), user.getPassword()));
		 //userRepository.save(user);
		//users.add(user);
	
	}*/
		
}

