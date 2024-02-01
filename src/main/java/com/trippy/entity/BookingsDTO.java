package com.trippy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    public long getTourIdValue() {
        return (tourId != null) ? tourId.longValue() : 0; // Change 0 to the default value you prefer
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
