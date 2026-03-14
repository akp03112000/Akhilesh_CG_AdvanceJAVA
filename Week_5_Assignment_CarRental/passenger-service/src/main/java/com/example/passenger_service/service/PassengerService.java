package com.example.passenger_service.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PassengerService {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String,Object> getPassengerDetails(){

        Map<String,Object> data = new HashMap<>();

        data.put("PassengerID","P101");
        data.put("PassengerName","Akhilesh Prajapati");

        List cars = restTemplate.getForObject(
                "http://localhost:6607/rentalcardetails",
                List.class
        );

        data.put("AvailableCars",cars);

        return data;
    }
}