package com.example.onlinerecipebook.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository repository;

    public List<Recipe> getAll(){
        return repository.getAll();
    }

    public String add(Recipe recipe) {
        return repository.add(recipe);
    }

    public String edit(Recipe recipe) {
        return repository.edit(recipe);
    }

    public String delete(int recipeNo) {
        return repository.delete(recipeNo);
    }
}
