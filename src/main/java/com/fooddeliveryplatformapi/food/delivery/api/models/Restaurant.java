package com.fooddeliveryplatformapi.food.delivery.api.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fooddeliveryplatformapi.food.delivery.api.models.Enums.FCategory;
import com.fooddeliveryplatformapi.food.delivery.api.models.Enums.Specialty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Restaurant.class,property="restaurantId")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    @NotBlank
    private String restaurantName;

    @Pattern(regexp = "^.+@Restaurant\\.com$")
    @Column(unique = true)
    private String restaurantEmail;

    @Enumerated(EnumType.STRING)
    private Specialty restaurantSpecialty;

    @Enumerated(EnumType.STRING)
    private FCategory restaurantCategory;

    @NotNull
    private double rating;
     @ManyToMany(mappedBy = "restaurantList")
    List<Food> foodList;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "fk_addressId")
    Address address;


}
