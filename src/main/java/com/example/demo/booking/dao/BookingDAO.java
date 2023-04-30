package com.example.demo.booking.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.booking.dto.BookingDTO;

@Repository
@Mapper
public interface BookingDAO {

    List<BookingDTO> getBookingList(Date date);
}