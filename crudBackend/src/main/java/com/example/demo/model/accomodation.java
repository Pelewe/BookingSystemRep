package com.example.demo.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Accomodation")
public class accomodation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long propertyid;
	private String prop_name;
	private String prop_type;
	private String prop_description;
	private double price;
	private File image;
	private String servicesOffered;
	private int numberRoom;
	private String contact_name;
	private String country;
	private String province;
	private String city;
	private String addressline;
	private String streetAddress;
	private String postal_code;
	
	public accomodation() {
		
		super();
		country="South Africa";
	}

	public accomodation(String prop_name, String prop_type, String prop_description, double price, File image,
			String servicesOffered, int numberRoom, String contact_name, String province, String city,
			String addressline, String streetAddress, String postal_code) {
		super();
		this.prop_name = prop_name;
		this.prop_type = prop_type;
		this.prop_description = prop_description;
		this.price = price;
		this.image = image;
		this.servicesOffered = servicesOffered;
		this.numberRoom = numberRoom;
		this.contact_name = contact_name;
		this.province = province;
		this.city = city;
		this.addressline = addressline;
		this.streetAddress = streetAddress;
		this.postal_code = postal_code;
	}

	public Long getPropertyid() {
		return propertyid;
	}

	public String getProp_name() {
		return prop_name;
	}

	public void setProp_name(String prop_name) {
		this.prop_name = prop_name;
	}

	public String getProp_type() {
		return prop_type;
	}

	public void setProp_type(String prop_type) {
		this.prop_type = prop_type;
	}

	public String getProp_description() {
		return prop_description;
	}

	public void setProp_description(String prop_description) {
		this.prop_description = prop_description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getServicesOffered() {
		return servicesOffered;
	}

	public void setServicesOffered(String servicesOffered) {
		this.servicesOffered = servicesOffered;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getCountry() {
		return country;
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

	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	@Override
	public String toString() {
		return "accomodation [prop_name=" + prop_name + ", prop_type=" + prop_type + ", prop_description="
				+ prop_description + ", price=" + price + ", image=" + image + ", servicesOffered=" + servicesOffered
				+ ", numberRoom=" + numberRoom + ", contact_name=" + contact_name + ", country=" + country
				+ ", province=" + province + ", city=" + city + ", addressline=" + addressline + ", streetAddress="
				+ streetAddress + ", postal_code=" + postal_code + "]";
	}


	
	
	
}
