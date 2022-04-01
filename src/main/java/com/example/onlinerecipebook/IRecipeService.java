package com.example.onlinerecipebook;

import java.util.List;

public interface IRecipeService {

    List<Recipe> find();
    Recipe create (Recipe recipe);
    Recipe update(Long recipe_id, String recipe_name);
    void delete (Long recipe_id);
}
