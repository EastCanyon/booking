package com.example.demo.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.booking.dto.BookingDTO;
import com.example.demo.booking.service.BookingService;

//http://localhost:3000
@RestController
@CrossOrigin("*")
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public void insertBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.insertBooking(bookingDTO);
    }
}






