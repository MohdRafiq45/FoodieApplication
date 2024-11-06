package com.proj.dto;

import com.proj.entity.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantDto {


    private User user;
    private String id;
    private  String title;

    @Column(length = 1000)
    private List<String> images;

    private String description;
}
