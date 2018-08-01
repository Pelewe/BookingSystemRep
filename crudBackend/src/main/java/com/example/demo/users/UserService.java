package com.example.demo.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.location;
import com.example.demo.repository.UserRepository;

//import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User>getAllUser(){
		
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
		//return userRepository.findAll();
	}
	
	public Optional<User> getUser(@PathVariable("id") Long id){
	return userRepository.findById(id);
		//return users.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	public List<User> searchUser(@PathVariable("name") String name){
		
			List<User> cust = new ArrayList<>();
			List<User> user = new ArrayList<>();
			 user=(List<User>) userRepository.findAll();
	        
			
			cust=(List<User>) user.stream().filter(t-> t.getLname().equals(name)).collect(Collectors.toList());
			
		/*List<location> locations=new ArrayList<>();
		List<location> Alllocations=(List<location>) locatRep.findAll();
		locations=(List<location>) Alllocations.stream().filter(t->t.getProvince().equals(province)).collect(Collectors.toList());
		*/
			
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
		userRepository.deleteById(id);
		return true;
	}
	
	
	public void updateUser( User user){
		 userRepository.save(user);
	}
	
	public void createUser( User user){
		userRepository.save(new User(user.getFname(),user.getLname(),user.getEmail(),user.getPhoneNo(), user.getPassword()));
	}
	
	public User login(String Email)
	{
		
		List <User> user=userRepository.findAll();
		User valid=(User) user.stream().filter(t->t.getEmail().equals(Email));
		//return userRepository.findByEmail(Email);
		return valid;
	}
		
}

