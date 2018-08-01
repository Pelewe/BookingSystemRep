package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.location;

public interface locationRep extends CrudRepository<location, Integer> {
	
}
