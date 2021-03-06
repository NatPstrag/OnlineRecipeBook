package com.example.onlinerecipebook.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IRecipeRepository extends JpaRepository<Recipe, String> {

    @Query("SELECT r from Recipe r where r.name =?1")
    List<Recipe> findAllByOrderByIdAsc();
    Optional<Recipe> findRecipeByName(String name);
}
