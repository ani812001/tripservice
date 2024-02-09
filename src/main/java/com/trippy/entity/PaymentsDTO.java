package com.trippy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class PaymentsDTO implements Serializable {

    @JsonProperty
    private Long bookingId;

    @JsonProperty
    private String cardNo;

    @JsonProperty
    private String cvv;

    @JsonProperty
    private String fullName;

    @JsonProperty
    private String expiryDate;


    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}