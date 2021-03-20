package com.example.homework9.Controllers;

import com.example.homework9.DAO.UserDAO;
import com.example.homework9.Models.Car;
import com.example.homework9.Models.Product;
import com.example.homework9.Models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {


    private UserDAO userDAO;


    @GetMapping()
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("vasya");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("milk"));
        productList.add(new Product("kokos"));
        user.setProducts(productList);


        userDAO.save(user);
    }


    @GetMapping("/saveWithCars")
    public void saveWithCars() {

        User user = new User("max");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suba"));
        cars.add(new Car("mazda"));
        user.setCars(cars);
        userDAO.save(user);

    }


    @PostMapping("/save")
    public void saveUserWithImage(@RequestParam String name, @RequestParam MultipartFile image) throws IOException {


        String pathToImageFolder = System.getProperty("user.home") + File.separator + "pictures2" + File.separator + image.getOriginalFilename();
        image.transferTo(new File(pathToImageFolder));

        User user = new User();
        user.setName(name);

        String filename = image.getOriginalFilename();
        user.setImg(filename);
        userDAO.save(user);


    }

    @GetMapping("/{id}")
    public User getImageOfUser(@PathVariable int id) {
        System.out.println(id);

        User one = userDAO.getOne(id);
        System.out.println(one);
        return one;

    }

}
