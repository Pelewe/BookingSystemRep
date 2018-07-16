package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entities.User;
import com.example.repository.UserRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.repository")
@EnableJpaAuditing
public class CrudBackendApplication {
	//@Autowired
	//private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}
}
/*
public class CrudBackendApplication implements CommandLineRunner{
	@Autowired
	//private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//userRepository.save(new User("one", "one", "one@gmail.com", "0724586111","1234567889"));
		//userRepository.save(new User("two", "two", "two@gmail.com", "0824586111","123456789"));
		
		
	}
}
*/
