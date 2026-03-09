
package com.example.demo;

public class User {

    private int id;
    private String name;
    private String course;
    
    public User() {
    }

    public User(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}