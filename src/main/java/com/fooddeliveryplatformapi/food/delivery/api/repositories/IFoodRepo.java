package com.fooddeliveryplatformapi.food.delivery.api.repositories;


import com.fooddeliveryplatformapi.food.delivery.api.models.Enums.Cuisine;
import com.fooddeliveryplatformapi.food.delivery.api.models.Enums.FCategory;
import com.fooddeliveryplatformapi.food.delivery.api.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFoodRepo extends JpaRepository<Food,Integer> {


    Food findFirstByFoodName(String foodName);

    List<Food> findByFoodNameAndFoodCategoryAndFoodCuisineAndFoodPrice(String foodName, FCategory foodCategory, Cuisine foodCuisine, Double foodPrice);
}
