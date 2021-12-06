package com.dipak.spring.controller;
import com.dipak.spring.model.UserDetailsRequestModel;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class HomeController {

    @GetMapping
    public String getUser() {
        return "Got the user details";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return "User created successfully";
    }

    @PutMapping
    public String updateUser() {
        return "User record updated";
    }

    @DeleteMapping
    public String deleteUser() {
        return "User deleted successfully";
    }
}
