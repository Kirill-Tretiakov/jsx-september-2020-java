package com.example.homework9.Models;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"users"})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "cars")
    private List<User> users = new ArrayList<>();

    public Car(String model) {
        this.model = model;
    }
}