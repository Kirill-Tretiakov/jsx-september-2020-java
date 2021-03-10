package com.example.demo.DAO;

import com.example.demo.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car, Integer> {
}
