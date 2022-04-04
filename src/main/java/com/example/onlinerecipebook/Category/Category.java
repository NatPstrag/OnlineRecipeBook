package com.example.onlinerecipebook.Category;


import com.example.onlinerecipebook.Recipe;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    private String category;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "category"
    )
    private List<Recipe> recipe = new ArrayList<>();

    public Category(int id,String category) {
        this.id = id;
        this.category = category;
    }

    public Category() {

    }


    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
}
