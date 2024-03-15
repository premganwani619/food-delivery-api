package com.fooddeliveryplatformapi.food.delivery.api.services;


import com.fooddeliveryplatformapi.food.delivery.api.models.Authentication.AdminAuth;
import com.fooddeliveryplatformapi.food.delivery.api.repositories.IAdminAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthService {


    @Autowired
    IAdminAuthRepo adminAuthRepo;
    public void createToken(AdminAuth token) {
        adminAuthRepo.save(token);
    }

    public boolean authenticate(String email, String tokenValue) {
        AdminAuth token = adminAuthRepo.findByTokenValue(tokenValue);
        if(token!=null){
            return token.getAdmin().getAdminEmail().equals(email);
        }
        return false;
    }

    public void deleteToken(String tokenValue) {
        AdminAuth token = adminAuthRepo.findByTokenValue(tokenValue);
        adminAuthRepo.delete(token);
    }
}
