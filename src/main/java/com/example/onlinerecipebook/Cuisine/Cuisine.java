package com.example.onlinerecipebook.Cuisine;

import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "cuisines")
public class Cuisine {

    @Id
    private String cuisine;

    @ManyToMany(mappedBy = "cuisines")
    private List<Recipe> recipes;

    public Cuisine(String cuisine, List<Recipe> recipes) {
        this.cuisine = cuisine;
        this.recipes = recipes;
    }

    public Cuisine() {
    }

    public Cuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {return cuisine;}
    public void setCuisine(String cuisine) {this.cuisine = cuisine;}

    public List<Recipe> getRecipes() {return recipes;}
    public void setRecipes(List<Recipe> recipes) {this.recipes = recipes;}
}
