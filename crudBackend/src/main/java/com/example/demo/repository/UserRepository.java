package com.example.demo.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.users.User;



public interface UserRepository extends CrudRepository <User, Long>{
	
	/*static List<User> findBylname(String name) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
