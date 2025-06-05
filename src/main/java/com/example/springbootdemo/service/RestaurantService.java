package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Restaurant;
import com.example.springbootdemo.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant updateProfile(Restaur...