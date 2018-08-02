package com.example.demo.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String booking_ID;
	
	private long custNo;
	private String booking_type;
	private String desc;
	
	private Date checkInDate;
	private Date checkOutDate;
	private String prop_name;
	private String prop_type;
	private String numberRoom;
	private String city;
	private String contact_name;
	private String addressline2;
	private String country;
	
	private int noOfChildren;
	private int noOfAdults;
	
	private String province;
	private String streetAddress;
	private int prop_Id;
	private int nights;
	
	
	public bookings() {
		
	}
	public bookings(String bookingID, long custNo, String booking_type, String desc) {
		super();
		this.booking_ID = bookingID;
		this.custNo = custNo;
		this.booking_type = booking_type;
		this.desc = desc;
	}
	
	public String getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(String booking_ID) {
		this.booking_ID = booking_ID;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
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
	public String getNumberRoom() {
		return numberRoom;
	}
	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public int getProp_Id() {
		return prop_Id;
	}
	public void setProp_Id(int prop_Id) {
		this.prop_Id = prop_Id;
	}
	public int getNights() {
		return nights;
	}
	public void setNights(int nights) {
		this.nights = nights;
	}
	public String getBookingID() {
		return booking_ID;
	}
	public void setBookingID(String bookingID) {
		this.booking_ID = bookingID;
	}
	public long getCustNo() {
		return custNo;
	}
	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}
	public String getBooking_type() {
		return booking_type;
	}
	public void setBooking_type(String booking_type) {
		this.booking_type = booking_type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		desc = desc;
	}
	public bookings(String booking_ID, long custNo, String booking_type, String desc, Date checkInDate,
			Date checkOutDate, String prop_name, String prop_type, String numberRoom, String city, String contact_name,
			String addressline2, String country, int noOfChildren, int noOfAdults, String province,
			String streetAddress, int prop_Id, int nights) {
		super();
		this.booking_ID = booking_ID;
		this.custNo = custNo;
		this.booking_type = booking_type;
		this.desc = desc;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.prop_name = prop_name;
		this.prop_type = prop_type;
		this.numberRoom = numberRoom;
		this.city = city;
		this.contact_name = contact_name;
		this.addressline2 = addressline2;
		this.country = country;
		this.noOfChildren = noOfChildren;
		this.noOfAdults = noOfAdults;
		this.province = province;
		this.streetAddress = streetAddress;
		this.prop_Id = prop_Id;
		this.nights = nights;
	}
	
	
}
