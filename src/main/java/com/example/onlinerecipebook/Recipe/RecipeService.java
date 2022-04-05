package com.example.onlinerecipebook.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements IRecipeService{

    @Autowired
    private RecipeRepository repository;


    @Override
    public List<Recipe> find() {
        return repository.findAllByOrderByIdAsc();
    }

    @Override
    public Recipe create(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    public Recipe update(Long id, String name) {
        return repository.findById(id)
                .map(existingRecipe -> {
                    existingRecipe.setName(name);
                    return repository.save(existingRecipe);
                })
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
