package com.trippy.Repository;

import com.trippy.Entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepo extends JpaRepository<Tour,Long> {
}
