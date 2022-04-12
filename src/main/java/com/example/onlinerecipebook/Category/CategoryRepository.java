package com.example.onlinerecipebook.Category;

import com.example.onlinerecipebook.Category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository <Category, String> {

    @Query("SELECT c from Category c where c.category =?1")
    Optional<Category> findRecipeByCategory(String category);

}
