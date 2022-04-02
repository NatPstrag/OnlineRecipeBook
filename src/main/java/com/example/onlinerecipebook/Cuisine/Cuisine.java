package com.example.onlinerecipebook.Cuisine;

import javax.persistence.*;

@Entity
@Table
public class Cuisine {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String cuisine;

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
