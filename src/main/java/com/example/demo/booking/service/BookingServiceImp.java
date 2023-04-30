package com.example.demo.booking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.booking.dao.BookingDAO;
import com.example.demo.booking.dto.BookingDTO;

@Repository
@Service
public class BookingServiceImp implements BookingService {

    @Autowired
    private BookingDAO bookingDAO;

    @Override
    public List<BookingDTO> getBookingList(Date date) {
        return bookingDAO.getBookingList(date);
    }
}
