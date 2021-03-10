package com.example.demo.Controller;

import com.example.demo.DAO.CarDAO;
import com.example.demo.Models.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Controller
@AllArgsConstructor
public class MainController {
    private CarDAO carDAO;


    @PostMapping("/")
    public String home() {
        return "index.html";
    }

    @PostMapping("/save")
    public String save(@RequestParam Map<String, String> map) {
        System.out.println(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }


        return "index.html";
    }

    @PostMapping("/save")
    public String saveGet(@RequestParam("CarName") String name, Model model) {
        carDAO.save(new Car(name));
        model.addAttribute("cars",carDAO.findAll());

        return "cars.html";
    }

    @PostMapping("/cars/{id}")
    public String getUser(@PathVariable int id, Model model) {
        Car one = carDAO.getOne(id);

        model.addAttribute("car", one);


        return "car.html";
    }
}