package com.example.onlinerecipebook.Difficulty;

import com.example.onlinerecipebook.Category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DifficultyRepository extends JpaRepository<Difficulty, String> {


    @Query("SELECT d from Difficulty d where d.difficult =?1")
    Optional<Difficulty> findRecipeByDifficult(String difficult);

}
