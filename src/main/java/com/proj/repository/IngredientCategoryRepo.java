package com.proj.repository;

import com.proj.entity.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IngredientCategoryRepo extends JpaRepository<IngredientCategory, Long> {
}
