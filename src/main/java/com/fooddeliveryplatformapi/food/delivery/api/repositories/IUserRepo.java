package com.fooddeliveryplatformapi.food.delivery.api.repositories;

import com.fooddeliveryplatformapi.food.delivery.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String newEmail);
}
