package com.example.homework9.services;

import com.example.homework9.Models.Car;

import java.util.List;


public interface CarService {

    void save(Car car);

    List<Car> findAll();
}

