package com.example.onlinerecipebook.Cuisine;

import com.example.onlinerecipebook.Difficulty.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CuisineRepository extends JpaRepository<Cuisine, String> {

    @Query("SELECT c from Cuisine c where c.cuisine =?1")
    Optional<Cuisine> findRecipeByCuisine(String cuisine);

}
