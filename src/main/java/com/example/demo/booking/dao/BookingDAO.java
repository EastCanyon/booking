package com.example.demo.booking.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.booking.Booking;

@Repository
public interface BookingDAO {

    List<Booking> getBookingsByDate(LocalDate date);

}
