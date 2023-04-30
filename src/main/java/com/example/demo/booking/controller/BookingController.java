package com.example.demo.booking.controller;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.booking.dto.BookingDTO;
import com.example.demo.booking.service.BookingService;

@RestController
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

//    @PostMapping("/calendar")
//    @ResponseBody
//    public String cal(@RequestBody String selectedDate) {

//    }
    
    
    @PostMapping("/calendar")
    @ResponseBody
    public List<BookingDTO> getBookingList(@RequestBody String selectedDate) throws Exception {
    	SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss", Locale.KOREA);
    	Date date = format.parse(selectedDate);
        List<BookingDTO> bookingList = bookingService.getBookingList(date);
        for (BookingDTO bookingDto : bookingList) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            bookingDto.setStartTime(timeFormat.format(bookingDto.getStartTime()));
            bookingDto.setEndTime(timeFormat.format(bookingDto.getEndTime()));
        }
        return bookingList;
    }



}  
