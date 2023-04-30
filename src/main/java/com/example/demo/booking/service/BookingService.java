package com.example.demo.booking.service;

import java.util.Date;
import java.util.List;

import com.example.demo.booking.dto.BookingDTO;

public interface BookingService {

    List<BookingDTO> getBookingList(Date date);
}
