package com.example.Fullstackdevelopment.repo;

import com.example.Fullstackdevelopment.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carrepo extends JpaRepository<Car,Long> {

}
