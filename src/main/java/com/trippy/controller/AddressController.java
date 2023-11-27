package com.trippy.controller;

import com.trippy.Entity.Address;
import com.trippy.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addAddress")
    public Address postAddressDetails(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAddresses() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }
}
