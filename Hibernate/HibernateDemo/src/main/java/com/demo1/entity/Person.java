package com.demo1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Person {

    @Id
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name="passport_id")
    private Passport passport;

    public Person() {}

    public Person(int id, String name, Passport passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }
}