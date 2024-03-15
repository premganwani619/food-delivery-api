package com.fooddeliveryplatformapi.food.delivery.api.repositories;

import com.fooddeliveryplatformapi.food.delivery.api.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo  extends JpaRepository<Admin,Integer> {
    Admin findFirstByAdminEmail(String email);

}
