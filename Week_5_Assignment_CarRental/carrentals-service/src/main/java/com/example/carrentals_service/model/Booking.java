package com.example.carrentals_service.model;

public class Booking {




    private String bookingId;
    private String carName;
    private String status;

    public Booking(){}

    public Booking(String bookingId, String carName, String status) {
        this.bookingId = bookingId;
        this.carName = carName;
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}