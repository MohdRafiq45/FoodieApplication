package com.proj.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String street;

    private  String pinCode;

}
