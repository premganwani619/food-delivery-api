package com.fooddeliveryplatformapi.food.delivery.api.repositories;

import com.fooddeliveryplatformapi.food.delivery.api.models.Authentication.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserAuthRepo extends JpaRepository<UserAuth,Integer> {
    UserAuth findByTokenValue(String tokenValue);
}
