package com.trippy.controller;

import com.trippy.Entity.Payments;
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
    public Payments postPayment(@RequestBody Payments payment) {
        return paymentService.savePayment(payment);
    }

    @GetMapping("/payments")
    public ResponseEntity<List<Payments>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }
}
