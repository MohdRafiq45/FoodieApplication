package com.proj.repository;

import com.proj.entity.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientesItemRepo extends JpaRepository<IngredientsItem, Long> {
}
