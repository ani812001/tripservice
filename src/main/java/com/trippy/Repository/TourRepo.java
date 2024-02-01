package com.trippy.Repository;

import com.trippy.entity.Tours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepo extends JpaRepository<Tours, Long> {
}

