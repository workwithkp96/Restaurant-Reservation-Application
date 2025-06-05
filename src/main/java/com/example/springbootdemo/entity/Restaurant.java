package com.example.springbootdemo.entity;

import javax.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String contactInfo;
    private String menu;
    private String images;

    // Getters and Setter...