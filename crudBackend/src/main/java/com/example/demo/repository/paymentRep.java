package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.payment;

public interface paymentRep  extends JpaRepository<payment, Long> {

}