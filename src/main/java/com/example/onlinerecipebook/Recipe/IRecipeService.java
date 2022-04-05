package com.example.onlinerecipebook.Recipe;

import java.util.List;

public interface IRecipeService {

    List<Recipe> find();
    Recipe create (Recipe recipe);
    Recipe update (Long id, String name);
    void delete (Long id);

}
