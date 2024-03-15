package com.fooddeliveryplatformapi.food.delivery.api.services;


import com.fooddeliveryplatformapi.food.delivery.api.models.Address;
import com.fooddeliveryplatformapi.food.delivery.api.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }
}
