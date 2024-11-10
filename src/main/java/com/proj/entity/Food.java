package com.proj.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;

    private  String name;

    private String description;

    private Long price;

    @ManyToOne
    private Category category;


    @Column(length = 1000)
    @ElementCollection
    private List<String> images;


    private boolean availability;


    @ManyToOne
    private Restaurant restaurant;

    private boolean isVegetarian;

    private boolean isSeasonable;



    @ManyToMany
    private List<IngredientsItem> ingredientsItems;


    private Date creationDate;

}
