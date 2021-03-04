package com.example.demo.DAO;

import com.example.demo.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CarsDao extends JpaRepository<Car, Integer> {
}
