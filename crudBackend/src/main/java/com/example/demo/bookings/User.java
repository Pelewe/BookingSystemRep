/*package com.example.demo.bookings;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;





//@Table(name="Users")
//EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},allowGetters = true)
@Entity
public class User{
	@Id
	//@GeneratedValue
	//@Column(name= "customer_id")
	private Long id;
	//@Column(name= "first_name")
	private String fname;
	//@Column(name= "last_name")
	private String lname;
	//@Column(name= "email")
	private String Email;
	//@Column(name= "phone_no")
	private String PhoneNo;
	//@Column(name= "password")
	private String Password;
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Long getId() {
		return id;
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
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public User(String fname, String lname, String email, String phoneNo,String password) {
		
		this.fname = fname;
		this.lname = lname;
		Email = email;
		PhoneNo = phoneNo;
		Password = password;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", Email=" + Email + ", PhoneNo=" + PhoneNo
				+ "]";
	}
	
	
	
}
*/
