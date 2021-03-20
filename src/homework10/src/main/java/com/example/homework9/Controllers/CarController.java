package com.example.homework9.Controllers;


import com.example.homework9.Models.Car;
import com.example.homework9.services.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CarController {


    private CarService carService;

    public CarController(@Qualifier("s1") CarService carService) {
        this.carService = carService;
    }


    @PostMapping("/car/save")
    public void saveCar() {
        carService.save(new Car("ahsgdfhasgfdhg"));

    }
}