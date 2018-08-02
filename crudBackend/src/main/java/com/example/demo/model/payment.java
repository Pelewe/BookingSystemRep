package com.example.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.text.SimpleDateFormat;


@Entity
@Table(name="payment")
public class payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Payment_Id;
	private Long user_Id;
	private String cardType;
	private Long cardNo;
	private Date expirationDate;
	private int crcCode;
	private Date paymentDate;
	private String booking_no;
	
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

	public void setCardNo(Long cardNo) {
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


	public Long getPayment_Id() {
		return Payment_Id;
	}

	public Long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getBooking_no() {
		return booking_no;
	}
	public Date paymentDate() {
		return paymentDate;
	}
	public void setBooking_no(String booking_no) {
		this.booking_no = booking_no;
	}
	
	public String payment_method(String ctyp,long cNO,Date expD,int cvcC) {
		cardType=ctyp;
		cardNo =cNO;
		expirationDate=expD;
		crcCode=cvcC;
		paymentDate=new Date();
		
		
		return "SucessfullPayment";
	}

	public payment(Long user_Id, String cardType, Long cardNo, Date expirationDate, int crcCode, Long custNo,
			String booking_no) {
		super();
		this.user_Id = user_Id;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.expirationDate = expirationDate;
		this.crcCode = crcCode;
		this.booking_no = booking_no;
		this.paymentDate = new Date();
	}

	@Override
	public String toString() {
		return "payment [Payment_Id=" + Payment_Id + ", user_Id=" + user_Id + ", cardType=" + cardType + ", cardNo="
				+ cardNo + ", expirationDate=" + expirationDate + ", crcCode=" + crcCode + ", custNo=" 
				+ ", booking_no=" + booking_no + ", bookingDate=" + paymentDate + "]";
	}
	
	
}
