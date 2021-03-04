package com.example.demo.Controllers;

import com.example.demo.DAO.CarsDao;
import com.example.demo.Models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarControl {
    private CarsDao carsDao;

    public CarControl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @GetMapping("/saveCar")
    public void saveCar(@RequestParam String model) {
        Car car = new Car(model);
        carsDao.save(car);

    }


    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carsDao.findAll();
    }
}
