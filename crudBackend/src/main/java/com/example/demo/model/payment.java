package com.example.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.text.SimpleDateFormat;


//@Entity
//@Table(name="payment")
public class payment {
	//@cardNo
	private String cardType;
	private long cardNo;
	private Date expirationDate;
	private int crcCode;
	private long custNo;
	private String booking_no;
	private Date bookingDate;
	
	public payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getCrcCode() {
		return crcCode;
	}

	public void setCrcCode(int crcCode) {
		this.crcCode = crcCode;
	}

	public long getCustNo() {
		return custNo;
	}

	public void setCustNo(long custNo) {
		this.custNo = custNo;
	}

	public String getBooking_no() {
		return booking_no;
	}
	public Date bookingDate() {
		return bookingDate;
	}
	public void setBooking_no(String booking_no) {
		this.booking_no = booking_no;
	}
	
	public String payment_method(String ctyp,long cNO,Date expD,int cvcC) {
		cardType=ctyp;
		cardNo =cNO;
		expirationDate=expD;
		crcCode=cvcC;
		bookingDate=new Date();
		
		
		return "SucessfullPayment";
	}
	
	
}
