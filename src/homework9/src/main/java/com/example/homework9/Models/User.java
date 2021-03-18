package com.example.homework9.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"products", "cars"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String img;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private List<Product> products = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)

    @JsonIgnore
    private List<Car> cars = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public User(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public User(String name, String img) {
        this.name = name;
        this.img = img;
    }


}