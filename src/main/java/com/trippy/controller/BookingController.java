package com.trippy.controller;

import com.trippy.Service.UserService;
import com.trippy.entity.Bookings;
import com.trippy.entity.BookingsDTO;
import com.trippy.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserService userService;

    @PostMapping("/book")
    public Bookings postBookingDetails(@RequestBody @Validated BookingsDTO bookingsDTO) {
         Bookings b = new Bookings();
         b.setRefUserId(userService.getUserByEmail(bookingsDTO.getEmail()).getId());
         b.setTourId(bookingsDTO.getTourId());
         b.setCreatedAt(Calendar.getInstance().getTime());
         b.setStartDate(bookingsDTO.getStartDate());
         b.setEmail(bookingsDTO.getEmail());
         b.setPhoneNumber(bookingsDTO.getPhoneNumber());
         b.setNumberOfTravelers(bookingsDTO.getNoOfTravelers());
        System.out.printf("booking %s \n", b);
        return bookingService.saveBooking(b);
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Bookings>> getBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }
}
