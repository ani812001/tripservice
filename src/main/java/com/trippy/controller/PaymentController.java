package com.trippy.controller;

import com.trippy.entity.PaymentStatus;
import com.trippy.entity.Payments;
import com.trippy.entity.PaymentsDTO;
import com.trippy.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public Payments addPayment(@RequestBody PaymentsDTO payment) {
        Payments p = new Payments();
        p.setBookingId(payment.getBookingId());
        p.setCardNo(payment.getCardNo());
        p.setStatus(PaymentStatus.completed);
        p.setDate(payment.getDate());
        p.setAmount(payment.getAmount());
        p.setCreatedAt(Calendar.getInstance().getTime());
        return paymentService.savePayment(p);
    }

    @GetMapping("/payments")
    public ResponseEntity<List<Payments>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }


}
