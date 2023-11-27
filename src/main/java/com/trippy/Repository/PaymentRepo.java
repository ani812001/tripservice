package com.trippy.Repository;

import com.trippy.Entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payments, Long> {
}
