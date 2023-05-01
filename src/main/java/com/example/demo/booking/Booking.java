package com.example.demo.booking;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Booking {
	private int bookingCode;
	private Date bookingDate;
	private Date cancleDate;
	private Date useState;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	private int cost;
	private String bookingState;
	private int userCode;
	private int mainCode;
	
	public int getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(int bookingCode) {
		this.bookingCode = bookingCode;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getCancleDate() {
		return cancleDate;
	}
	public void setCancleDate(Date cancleDate) {
		this.cancleDate = cancleDate;
	}
	public Date getUseState() {
		return useState;
	}
	public void setUseState(Date useState) {
		this.useState = useState;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBookingState() {
		return bookingState;
	}
	public void setBookingState(String bookingState) {
		this.bookingState = bookingState;
	}
	public int getUserCode() {
		return userCode;
	}
	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}
	public int getMainCode() {
		return mainCode;
	}
	public void setMainCode(int mainCode) {
		this.mainCode = mainCode;
	}
}
