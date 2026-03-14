package com.example.carrentals_service.model;

public class CarRental {

    private String carId;
    private String carName;
    private String company;

    public CarRental() {
    }

    public CarRental(String carId, String carName, String company) {
        this.carId = carId;
        this.carName = carName;
        this.company = company;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}