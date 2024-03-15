package com.fooddeliveryplatformapi.food.delivery.api.repositories;
import com.fooddeliveryplatformapi.food.delivery.api.models.Order;
import com.fooddeliveryplatformapi.food.delivery.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
    List<Order> findByUser(User user);

}
