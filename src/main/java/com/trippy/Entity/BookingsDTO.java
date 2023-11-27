package com.trippy.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;

public class BookingsDTO implements Serializable {

    @JsonProperty
    private Long tourId;

    @JsonProperty
    private int noOfSeats;

    @JsonProperty
    private Long refUserId;


    public BookingsDTO() {
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Long getRefUserId() {
        return refUserId;
    }

    public void setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
    }

}
