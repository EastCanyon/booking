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
//http://localhost:3000
public class BookingController {

    @Autowired
    private BookingService bookingService;

//    @PostMapping("/calendar")
//    @ResponseBody
//    public String cal(@RequestBody String selectedDate) {

//    }
    
    
    @PostMapping("/calendar")
    @ResponseBody
    public List<BookingDTO> getBookingList(@RequestBody String newDate) throws Exception {
        // 요청 본문에서 날짜 읽어들이기
    	System.out.println(newDate);
    	String aDate=newDate.substring(1,9);
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd", Locale.KOREA);
        Date date = dateFormat.parse(aDate);
        System.out.println(date);
        // 선택한 날짜에 대한 예약 목록 가져오기
        List<BookingDTO> bookingList = bookingService.getBookingList(aDate);
        
        // 시간 포맷 변경
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        for (BookingDTO bookingDto : bookingList) {
            bookingDto.setStartTime(timeFormat.format(bookingDto.getStartTime()));
            System.out.println(bookingDto.getStartTime());
            bookingDto.setEndTime(timeFormat.format(bookingDto.getEndTime()));
            System.out.println(bookingDto.getEndTime());
        }
  
        // 예약 목록 반환
        return bookingList;

    }





}  
