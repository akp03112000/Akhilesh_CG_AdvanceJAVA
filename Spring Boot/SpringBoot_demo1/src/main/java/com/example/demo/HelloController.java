

/*
 * package com.example.demo;
 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   /* 
    * @GetMapping("/hello")
    public String sayHello() {
        return "Hello Akhilesh, your first API is working!";
    }
    

@GetMapping("/user")
public User getUser() {
    return new User(1, "Akhilesh", "Spring Boot");
}
}
*/
package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/user")
    public User getUser() {
        return new User(1, "Akhilesh", "Spring Boot");
    }
    
    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return user;
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return user;
}
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User with ID " + id + " deleted successfully!";
    }
}