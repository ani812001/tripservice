package com.trippy.controller;

import com.trippy.entity.Payments;
import com.trippy.entity.PaymentsDTO;
import com.trippy.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public Payments addPayment(@RequestBody PaymentsDTO payment) {
        Payments p = new Payments();
        p.setCVV(payment.getCvv());
        p.setCardNo(payment.getCardNo());
        p.setExpiryDate(payment.getExpiryDate());
        p.setFullName(payment.getFullName());
        p.setBookingId(payment.getBookingId());
        return paymentService.savePayment(p);
    }

    @GetMapping("/payments")
    public ResponseEntity<List<Payments>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }


}
