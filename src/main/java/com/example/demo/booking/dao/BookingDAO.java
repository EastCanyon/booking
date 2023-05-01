package com.example.demo.booking.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.booking.dto.BookingDTO;

@Repository
@Mapper
public interface BookingDAO {
    void insertBooking(BookingDTO bookingDTO);
}


//    List<BookingDTO> getBookingList(String date);

