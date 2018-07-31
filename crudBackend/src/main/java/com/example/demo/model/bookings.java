package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

//@Entity
//@Table(name="booking")
public class bookings {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String bookingID;
	private long custNo;
	private String booking_type;
	private String Desc;
	
	public bookings() {
		
	}
	public bookings(String bookingID, long custNo, String booking_type, String desc) {
		super();
		this.bookingID = bookingID;
		this.custNo = custNo;
		this.booking_type = booking_type;
		Desc = desc;
	}
	public String getBookingID() {
		return bookingID;
	}
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
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
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	
	
}
