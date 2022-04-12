package com.example.onlinerecipebook.Ingridient;


import com.example.onlinerecipebook.Recipe.Recipe;
import com.example.onlinerecipebook.Unit.Unit;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double quantity;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "unit_name",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "unit_id"))
    private List<Unit> units;

    @ManyToOne
    @JoinColumn(name="RECIPE_NAME")
    private Recipe recipes;



    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public Ingredient(String name, double quantity, Recipe recipes) {
        this.name = name;
        this.quantity = quantity;
        this.recipes = recipes;
    }

    public Ingredient() {
    }

    public Ingredient(String name, double quantity, List<Unit> units, Recipe recipes) {
        this.name = name;
        this.quantity = quantity;
        this.units = units;
        this.recipes = recipes;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getQuantity() {return quantity;}
    public void setQuantity(double quantity) {this.quantity = quantity;}

    public List<Unit> getUnits() {return units;}
    public void setUnits(List<Unit> units) {this.units = units;}

    public Recipe getRecipes() {return recipes;}
    public void setRecipes(Recipe recipes) {this.recipes = recipes;}
}
