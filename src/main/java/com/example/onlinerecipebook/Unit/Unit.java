package com.example.onlinerecipebook.Unit;


import com.example.onlinerecipebook.Ingridient.Ingredient;
import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "units")
public class Unit {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String unit;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "unit"
    )
    private List<Ingredient> ingredients = new ArrayList<>();


    public Unit() {
    }

    public Unit(int id, String unit) {
        this.id = id;
        this.unit = unit;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}
}
