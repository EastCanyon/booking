package com.example.demo.booking.dto;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

public class BookingDTO {
	
	private int id;
	private int mainCode;
	private Timestamp startTime;
	private Timestamp endTime;
	private int bookingState;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMainCode() {
		return mainCode;
	}
	public void setMainCode(int mainCode) {
		this.mainCode = mainCode;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) throws ParseException {
	    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss", Locale.KOREA);
	    Date parsedDate = format.parse(startTime);
	    this.startTime = new Timestamp(parsedDate.getTime());
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) throws ParseException {
	    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss", Locale.KOREA);
	    Date parsedDate = format.parse(endTime);
	    this.endTime = new Timestamp(parsedDate.getTime());
	}
	public int getBookingState() {
		return bookingState;
	}
	public void setBookingState(int bookingState) {
		this.bookingState = bookingState;
	}

}
