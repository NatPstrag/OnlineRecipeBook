package com.example.onlinerecipebook.Ingridient;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    @Query("SELECT i from Ingredient i where i.name =?1")
    Optional<Ingredient> findRecipeByIngredient(String name);

}
