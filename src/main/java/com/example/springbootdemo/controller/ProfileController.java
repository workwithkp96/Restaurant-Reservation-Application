package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Restaurant;
import com.example.springbootdemo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/update")
    public Restaurant updateProfile...