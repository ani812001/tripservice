package com.trippy.Repository;

import com.trippy.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Bookings, Long> {
}
