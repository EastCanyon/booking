package com.example.demo.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.booking.dao.BookingDAO;
import com.example.demo.booking.dto.BookingDTO;

@Repository
@Service
public class BookingServiceImp implements BookingService {
	private final BookingDAO bookingDAO;
	
	@Autowired
	public BookingServiceImp(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}
	
	@Override
	public void insertBooking(BookingDTO bookingDTO) {
		bookingDAO.insertBooking(bookingDTO);
	}

//    @Override
//    public List<BookingDTO> getBookingList(String date) {
//        return bookingDAO.getBookingList(date);
//    }
}
