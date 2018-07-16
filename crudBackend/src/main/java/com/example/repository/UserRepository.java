package com.example.repository;

import com.example.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	

}
