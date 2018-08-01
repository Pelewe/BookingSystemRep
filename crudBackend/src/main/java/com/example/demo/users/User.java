package com.example.demo.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name="user")
//EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},allowGetters = true)


public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name= "fname")
	private String fname;
	@Column(name= "lname")
	private String lname;
	@Column(name= "email")
	private String Email;
	@Column(name= "phone_no")
	private String phone_no;
	@Column(name= "password")
	private String Password;
	@Column(name= "user_type")
	private int user_type;
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Long getId() {
		return id;
	}
	public int getUserType() {
		return user_type;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return phone_no;
	}
	public void setPhoneNo(String phoneNo) {
		phone_no = phoneNo;
	}
	public User(String fname, String lname, String email, String phoneNo,String password) {
		
		this.fname = fname;
		this.lname = lname;
		Email = email;
		phone_no = phoneNo;
		Password = password;
	}
	public User(String email, String pass) {
		Email=email;
		Password=pass;
	}
	public User() {
		user_type=1;
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", Email=" + Email + ", PhoneNo=" + phone_no
				+ "]";
	}
	public void login(String email, String pass )
	{
		
	}
	
	
}
