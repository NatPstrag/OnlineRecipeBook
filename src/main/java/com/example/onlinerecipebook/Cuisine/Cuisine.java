package com.example.onlinerecipebook.Cuisine;

import com.example.onlinerecipebook.Recipe;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Cuisine {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String cuisine;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "cuisine"
    )
    private List<Recipe> recipe = new ArrayList<>();


    public Cuisine() {
    }

    public Cuisine(int id, String cuisine) {
        this.id = id;
        this.cuisine = cuisine;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getCuisine() {return cuisine;}
    public void setCuisine(String cuisine) {this.cuisine = cuisine;}
}
