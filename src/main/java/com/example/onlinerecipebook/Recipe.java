package com.example.onlinerecipebook;

import javax.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipe_id;

    private String recipe_name;
    private String image;

    public Recipe() {
    }

    public Recipe(String recipe_name, String image) {
        this.recipe_name = recipe_name;
        this.image = image;
    }

    public Long getRecipe_id() {
        return recipe_id;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
