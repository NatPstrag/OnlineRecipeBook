package com.example.onlinerecipebook.Unit;


import com.example.onlinerecipebook.Ingridient.Ingredient;
import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "measure_unit")
public class Unit {

    @Id
    private String unit;

    @ManyToMany(mappedBy = "units")
    private List<Ingredient> ingredients;


    public Unit(String unit, List<Ingredient> ingredients) {
        this.unit = unit;
        this.ingredients = ingredients;
    }

    public Unit() {
    }

    public Unit( String unit) {

        this.unit = unit;
    }


    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}

    public List<Ingredient> getIngredients() {return ingredients;}
    public void setIngredients(List<Ingredient> ingredients) {this.ingredients = ingredients;}
}
