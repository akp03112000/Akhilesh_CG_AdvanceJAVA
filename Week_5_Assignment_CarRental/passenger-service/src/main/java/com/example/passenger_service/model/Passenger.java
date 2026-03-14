package com.example.passenger_service.model;




public class Passenger {

    private String passengerId;
    private String passengerName;

    public Passenger(){}

    public Passenger(String passengerId, String passengerName) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}