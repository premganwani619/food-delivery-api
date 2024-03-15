package com.fooddeliveryplatformapi.food.delivery.api.repositories;


import com.fooddeliveryplatformapi.food.delivery.api.models.Authentication.AdminAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminAuthRepo extends JpaRepository<AdminAuth,Integer> {
    AdminAuth findByTokenValue(String tokenValue);
}
