package com.demo1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

    @Id
    private int passportId;
    private String country;

    public Passport() {}

    public Passport(int passportId, String country) {
        this.passportId = passportId;
        this.country = country;
    }
}
