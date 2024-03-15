package com.fooddeliveryplatformapi.food.delivery.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @NotBlank
  private String  addressName ;

    @NotEmpty
   private String  landmark;

    @Size(min = 10,max = 13)
   private String  phoneNumber;

    @NotNull
   private String  zipcode;
    @NotBlank
    private String district;
    @NotBlank
   private String  state;

}
