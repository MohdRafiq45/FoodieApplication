package com.proj.repository;

import com.proj.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepo extends JpaRepository<Food, Long> {
}
