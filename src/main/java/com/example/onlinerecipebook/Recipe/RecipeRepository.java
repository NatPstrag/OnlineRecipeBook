package com.example.onlinerecipebook.Recipe;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    public List<Recipe> recipes = new ArrayList<Recipe>();

    public List<Recipe> getAll(){
        return  recipes;
    }

    public String add(Recipe recipe) {
        recipes.add(recipe);
        return "Successfully added";
    }

    public String edit(Recipe recipe) {
        recipes.stream().filter(r -> r.getId() == recipe.getId()).forEach(r -> {
            r.setName(recipe.getName());
            r.setImage(recipe.getImage());
        });
        return "Successfully edit";
    }
}
