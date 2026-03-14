package com.example.carrentals_service.controller;



import com.example.carrentals_service.model.CarRental;
import com.example.carrentals_service.model.Booking;
import com.example.carrentals_service.service.CarRentalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CarRentalController {

    @Autowired
    private CarRentalService carRentalService;

    @GetMapping("/rentalcardetails")
    public List<CarRental> getRentalCars() {
        return carRentalService.getRentalCars();
    }

    @GetMapping("/bookingdetails")
    public Booking getBookingDetails() {
        return carRentalService.getBookingDetails();
    }
}