package com.proj.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToOne
    private  User owner;

    private String description;
    private String name;

    private String cuisineType;


    @OneToOne
    private Address address;


    @Embedded
    private ContactInformation contactInformation;

    private String openingHours;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> ordersList= new ArrayList<>();

    @ElementCollection
    @Column(length = 1000)
    private List<String> restaurantImages;

    private LocalDateTime registrationDate;


    private  boolean availability;


    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Food> foodList= new ArrayList<>();






}
