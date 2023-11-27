package com.trippy.Service;

import com.trippy.Entity.Address;
import com.trippy.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    public Address saveAddress(Address address) {
        return addressRepo.save(address);
    }

    public List<Address> getAllAddresses() {
        System.out.println("got request");
        return addressRepo.findAll();
    }
}

