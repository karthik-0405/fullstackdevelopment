package com.example.Fullstackdevelopment.controller;

import com.example.Fullstackdevelopment.model.Car;
import com.example.Fullstackdevelopment.repo.Carrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Carcontroller {

    @Autowired
    private Carrepo carRepository;

    // Get all users
    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllcars() {
        List<Car> cars = carRepository.findAll();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }
}
