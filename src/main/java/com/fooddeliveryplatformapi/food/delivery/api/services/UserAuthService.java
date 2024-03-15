package com.fooddeliveryplatformapi.food.delivery.api.services;


import com.fooddeliveryplatformapi.food.delivery.api.models.Authentication.UserAuth;
import com.fooddeliveryplatformapi.food.delivery.api.repositories.IUserAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {
    @Autowired
    IUserAuthRepo userAuthRepo;


    public void createToken(UserAuth token) {
        userAuthRepo.save(token);
    }

    public boolean authenticate(String email, String tokenValue) {
        UserAuth token = userAuthRepo.findByTokenValue(tokenValue);
        if (token!=null){
            return token.getUser().getUserEmail().equals(email);
        }
        return false;
    }

    public void deleteToken(String tokenValue) {
        UserAuth token = userAuthRepo.findByTokenValue(tokenValue);
        userAuthRepo.delete(token);
    }
}
