package com.example.restaurantreservation.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String contactInfo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MenuItem> menuItems = new ArrayList<>();

    @ElementCollection
    private List<String> images = new ArrayList<>();

    // Getters and Setters
    // Methods: updateProfile, addMenuItem, uploadImage
}
