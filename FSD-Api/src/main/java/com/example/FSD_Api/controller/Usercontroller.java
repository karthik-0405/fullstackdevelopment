package com.example.FSD_Api.controller;
import com.example.FSD_Api.model.UserModel;
import com.example.FSD_Api.repository.UserRepository;
import com.example.FSD_Api.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")

public class Usercontroller {
    @Autowired
    private UserRepository userRepo;

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserModel user) {
        System.out.println("Hello World!");
        System.out.println("Received User : " + user); //
        userRepo.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }



}


