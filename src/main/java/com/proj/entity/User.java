package com.proj.entity;


import com.proj.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users_table")
@Data
public class User {
    private String userId;
    private String fullName;
    private String email;
    private String password;
    private ROLE role;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY,mappedBy = "customer")
    private List<Orders> orders= new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY, mappedBy = "user")
    private List<RestaurantDto> favourites= new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "id")
    private List<Address> address= new ArrayList<>();







}
