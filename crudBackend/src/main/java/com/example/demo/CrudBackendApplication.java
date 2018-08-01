package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.example.repository.UserRepository;


@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.example.demo.repository")
//@EnableJpaAuditing

public class CrudBackendApplication {

	public static void  main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
		
	}
	
	
}

