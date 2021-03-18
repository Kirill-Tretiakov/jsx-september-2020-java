package com.example.homework9.services.implementation;

import com.example.homework9.DAO.CarDAO;
import com.example.homework9.Models.Car;
import com.example.homework9.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("s1")
public class CarServiceImplementationOne implements CarService {


    private CarDAO carDAO;

    @Override
    public void save(Car car) {

        if (car != null) {
            carDAO.save(car);
        }

    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}
