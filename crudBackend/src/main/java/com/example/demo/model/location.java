package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private String province;
	private String city;
	private String subburb;
	private String p_address;
	private String street;
	
	public location() {
		country="South Africa";
	}
	public location(String province, String city) {
		super();
		this.province = province;
		this.city = city;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubburb() {
		return subburb;
	}
	public void setSubburb(String subburb) {
		this.subburb = subburb;
	}
	public String getP_address() {
		return p_address;
	}
	public void setP_address(String p_address) {
		this.p_address = p_address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "accomodation [country=" + country + ", province=" + province + ", city=" + city + ", subburb=" + subburb
				+ ", p_address=" + p_address + ", street=" + street + "]";
	}
	
}
