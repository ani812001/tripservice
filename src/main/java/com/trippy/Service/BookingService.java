package com.trippy.Service;

import com.trippy.entity.Bookings;
import com.trippy.Repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    public Bookings saveBooking(Bookings bookings) {
        return bookingRepo.save(bookings);
    }

    public List<Bookings> getAllBookings() {
        System.out.println();
        return bookingRepo.findAll();
    }
}


