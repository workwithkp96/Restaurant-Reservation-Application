package com.example.restaurantreservation.controllers;

import com.example.restaurantreservation.entities.MenuItem;
import com.example.restaurantreservation.entities.Restaurant;
import com.example.restaurantreservation.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PutMapping("/{id}/profile")
    public void updateProfile(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        restaurantService.updateProfile(id, restaurant);
    }

    @PostMapping("/{id}/menu")
    public void addMenuItem(@PathVariable Long id, @RequestBody MenuItem menuItem) {
        restaurantService.addMenuItem(id, menuItem);
    }

    @PostMapping("/{id}/images")
    public void uploadImage(@PathVariable Long id, @RequestParam String image) {
        restaurantService.uploadImage(id, image);
    }
}
