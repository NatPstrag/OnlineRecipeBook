package com.example.onlinerecipebook.Category;


import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    private String category;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes;

    public Category(String category, List<Recipe> recipes) {
        this.category = category;
        this.recipes = recipes;
    }

    public Category(String category) {
        this.category = category;
    }

    public Category() {
    }

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public List<Recipe> getRecipes() {return recipes;}
    public void setRecipes(List<Recipe> recipes) {this.recipes = recipes;}
}
