package com.fooddeliveryplatformapi.food.delivery.api.services;


import com.fooddeliveryplatformapi.food.delivery.api.models.Restaurant;
import com.fooddeliveryplatformapi.food.delivery.api.repositories.IRestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {



    @Autowired
    IRestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants() {
       return restaurantRepo.findAll();
    }

    public Restaurant getRestaurant(Integer restaurantId) {
        return restaurantRepo.findById(restaurantId).orElseThrow();
    }

    public boolean checkByName(String restaurantName) {
        Restaurant restaurant= restaurantRepo.findByRestaurantName(restaurantName);
        if (restaurant!=null){
            return true;
        }
        return false;
    }

    public boolean isAlready(String restaurantEmail) {
        Restaurant restaurant= restaurantRepo.findByRestaurantEmail(restaurantEmail);
        if (restaurant!=null){
            return true;
        }
        return false;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }
}
