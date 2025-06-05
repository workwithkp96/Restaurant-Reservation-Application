package com.example.restaurantreservation.services;

import com.example.restaurantreservation.entities.MenuItem;
import com.example.restaurantreservation.entities.Restaurant;
import com.example.restaurantreservation.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Transactional
    public void updateProfile(Long id, Restaurant restaurant) {
        Restaurant existingRestaurant = restaurantRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurant not found"));
        existingRestaurant.setName(restaurant.getName());
        existingRestaurant.setLocation(restaurant.getLocation());
        existingRestaurant.setContactInfo(restaurant.getContactInfo());
        existingRestaurant.setImages(restaurant.getImages());
        restaurantRepository.save(existingRestaurant);
    }

    @Transactional
    public void addMenuItem(Long id, MenuItem menuItem) {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurant not found"));
        restaurant.getMenuItems().add(menuItem);
        restaurantRepository.save(restaurant);
    }

    @Transactional
    public void uploadImage(Long id, String image) {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurant not found"));
        restaurant.getImages().add(image);
        restaurantRepository.save(restaurant);
    }
}
