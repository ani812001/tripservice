package com.trippy.controller;

import com.trippy.Entity.Tour;
import com.trippy.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourController {

    @Autowired
    private TourService tourService;

    @PostMapping("/addTourEntity")
    public Tour postDetails(@RequestBody Tour tripEntity)
    {
        return tourService.saveDetail(tripEntity);
    }


    @GetMapping("/tours")
    public ResponseEntity<List<Tour>> tours()
    {
        return ResponseEntity.ok(tourService.getAllTours());
    }
}
