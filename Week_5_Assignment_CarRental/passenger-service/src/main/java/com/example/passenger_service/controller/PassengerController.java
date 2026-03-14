package com.example.passenger_service.controller;




import com.example.passenger_service.service.PassengerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/passengerdetails")
    public Map<String,Object> getPassenger(){

        return passengerService.getPassengerDetails();
    }
}