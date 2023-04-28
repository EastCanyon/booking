package com.example.demo.booking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class BookingController {

//    @Autowired
//    private BookingService bookingService;

    @PostMapping("/calendar")
    @ResponseBody
    public String cal(@RequestBody String selectedDate) {
    	System.out.println("날짜"+selectedDate);
    	return selectedDate;
    }
    
}
