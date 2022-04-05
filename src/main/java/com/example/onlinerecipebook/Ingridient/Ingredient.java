package com.example.onlinerecipebook.Ingridient;

import com.example.onlinerecipebook.Difficulty.Difficulty;
import com.example.onlinerecipebook.Recipe.Recipe;
import com.example.onlinerecipebook.Unit.Unit;

import javax.persistence.*;

@Entity
@Table (name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double quantity;


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

    @ManyToOne
    @MapsId("id")
    @JoinColumn(
            name = "unit_id",
            foreignKey = @ForeignKey(
                    name = "ingredient_unit_id_fk"
            )
    )
    private Unit unit;

    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public Ingredient() {
    }



    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getQuantity() {return quantity;}
    public void setQuantity(double quantity) {this.quantity = quantity;}


}
