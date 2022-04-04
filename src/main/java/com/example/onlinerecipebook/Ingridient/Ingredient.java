package com.example.onlinerecipebook.Ingridient;

import com.example.onlinerecipebook.Category.Category;
import com.example.onlinerecipebook.Difficulty.Difficulty;
import com.example.onlinerecipebook.Recipe;

import javax.persistence.*;

@Entity
@Table
public class Ingredient {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double quantity;
    private String unit;


    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @ManyToOne
    @MapsId("id")
    @JoinColumn(
            name = "recipe_id",
            foreignKey = @ForeignKey(
                    name = "ingredient_recipe_id"
            )
    )
    private Recipe recipe;

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Ingredient() {
    }

    public Ingredient(String unit) {
        this.unit = unit;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getQuantity() {return quantity;}
    public void setQuantity(double quantity) {this.quantity = quantity;}

    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}
}
