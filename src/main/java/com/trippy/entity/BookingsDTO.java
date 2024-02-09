package com.trippy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class BookingsDTO implements Serializable {

    @JsonProperty
    private Long tourId;

    @JsonProperty
    private Date startDate;


    // New fields
    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String phoneNumber;

    @JsonProperty
    private int noOfTravelers;

    public BookingsDTO() {
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


// Getters and setters for existing fields

    // Getters and setters for new fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getNoOfTravelers() {
        return noOfTravelers;
    }

    public void setNoOfTravelers(int noOfTravelers) {
        this.noOfTravelers = noOfTravelers;
    }


}
