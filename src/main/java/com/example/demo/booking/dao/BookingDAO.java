package com.example.demo.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.booking.dto.BookingDTO;

@Repository
public class BookingDAO {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public BookingDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

    public void insertBooking(BookingDTO bookingDTO) {
        String sql = "INSERT INTO booking (BOOKING_CODE, BOOKING_DATE, CANCLE_DATE, USE_STATE, START_TIME, END_TIME, COST, BOOKING_STATE, USER_CODE, MAIN_CODE) VALUES (?, SYSDATE, null, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql, bookingDTO.getBookingCode(), bookingDTO.getUseState(), bookingDTO.getStartTime(), bookingDTO.getEndTime(), bookingDTO.getCost(), bookingDTO.getBookingState(), bookingDTO.getUserCode(), bookingDTO.getMainCode());
    }

//    List<BookingDTO> getBookingList(String date);
}
