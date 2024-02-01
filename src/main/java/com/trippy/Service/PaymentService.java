package com.trippy.Service;

import com.trippy.entity.Payments;
import com.trippy.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public Payments savePayment(Payments payment) {
        return paymentRepo.save(payment);
    }

    public List<Payments> getAllPayments() {
        System.out.println("got request");
        return paymentRepo.findAll();
    }
}
