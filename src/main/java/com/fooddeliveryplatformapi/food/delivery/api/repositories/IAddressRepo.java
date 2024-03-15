package com.fooddeliveryplatformapi.food.delivery.api.repositories;

import com.fooddeliveryplatformapi.food.delivery.api.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {

}
