package com.example.demo.booking.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingServiceImp {

//    @Autowired
//    private BookingDao bookingDao;
//
//    public List<TimeSlot> getAvailableTimeSlots(LocalDate date) {
//        List<Booking> bookings = bookingDao.getBookingsByDate(date);
//        List<TimeSlot> timeSlots = createTimeSlots(date);
//        for (Booking booking : bookings) {
//            LocalTime startTime = booking.getStartTime().toLocalTime();
//            LocalTime endTime = booking.getEndTime().toLocalTime();
//            int bookingState = booking.getBookingState();
//            for (TimeSlot timeSlot : timeSlots) {
//                if (timeSlot.getTime().isAfter(startTime) && timeSlot.getTime().plusHours(1).isBefore(endTime)) {
//                    if (bookingState == 0) {
//                        timeSlot.setAvailable(false);
//                    } else {
//                        timeSlot.setBooked(true);
//                    }
//                }
//            }
//        }
//        return timeSlots;
//    }
//
//    private List<TimeSlot> createTimeSlots(LocalDate date) {
//        List<TimeSlot> timeSlots = new ArrayList<>();
//        for (int i = 0; i < 24; i++) {
//            LocalTime time = LocalTime.of(i, 0);
//            timeSlots.add(new TimeSlot(date, time));
//        }
//        return timeSlots;
//    }
//}
	
}
