package com.example.onlinerecipebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeService implements IRecipeService {



    private final RecipeRepository repository;

    @Autowired
    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Recipe> find() {
        return repository.findAllByOrderByIdAsc();
    }

    @Override
    public Recipe create(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    public Recipe update(Long recipe_id, String recipe_name) {
            return repository.findById(recipe_id)
                    .map(existingRecipe -> {
                        existingRecipe.setRecipe_name(recipe_name);
                        return repository.save(existingRecipe);
                    })
                    .orElse(null);
    }

    @Override
    public void delete(Long recipe_id) {
        repository.deleteById(recipe_id);
    }
}
