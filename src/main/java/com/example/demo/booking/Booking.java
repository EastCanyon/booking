package com.example.demo.booking;

import java.sql.Timestamp;

public class Booking {
    private int id;
    private int mainCode;
    private Timestamp startTime;
    private Timestamp endTime;
    private String bookingState;

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

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getBookingState() {
        return bookingState;
    }

    public void setBookingState(String bookingState) {
        this.bookingState = bookingState;
    }
}
