package com.example.carrentals_service.service;




import com.example.carrentals_service.model.CarRental;
import com.example.carrentals_service.model.Booking;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarRentalService {

    public List<CarRental> getRentalCars(){

        List<CarRental> cars = new ArrayList<>();

        cars.add(new CarRental("C101","Hyundai Creta","Hyundai"));
        cars.add(new CarRental("C102","Toyota Fortuner","Toyota"));
        cars.add(new CarRental("C103","Mahindra XUV700","Mahindra"));

        return cars;
    }

    public Booking getBookingDetails(){
        return new Booking("B201","Hyundai Creta","Confirmed");
    }
}