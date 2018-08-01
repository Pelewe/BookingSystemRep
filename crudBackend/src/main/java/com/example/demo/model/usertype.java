package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.users.User;

//@Entity
//@Table(name="usertype")
public class usertype extends User{
	//@Id
	private int useridtype;
	private String descriprion;
	
	public usertype()
	{
		
	}
	public int getUsertype() {
		return useridtype;
	}
	public void setUsertype(int useridtype) {
		this.useridtype = useridtype;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	
	public usertype(int useridtype, String descriprion) {
		super();
		this.useridtype = useridtype;
		this.descriprion = descriprion;
	}
	@Override
	public String toString() {
		return "userType [userType=" + useridtype + ", descriprion=" + descriprion + "]";
	}
}
