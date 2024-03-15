package com.fooddeliveryplatformapi.food.delivery.api.repositories;

import com.fooddeliveryplatformapi.food.delivery.api.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepo extends JpaRepository<Restaurant, Integer> {
    Restaurant findByRestaurantName(String restaurantName);

    Restaurant findByRestaurantEmail(String restaurantEmail);
}
