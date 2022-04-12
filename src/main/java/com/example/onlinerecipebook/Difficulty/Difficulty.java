package com.example.onlinerecipebook.Difficulty;



import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name= "difficulties")
public class Difficulty {


    @Id
    private String difficult;

    @ManyToMany(mappedBy = "difficulties")
    private List<Recipe> recipes;

    public Difficulty(String difficult, List<Recipe> recipes) {
        this.difficult = difficult;
        this.recipes = recipes;
    }

    public Difficulty() {
    }

    public Difficulty(String difficult) {
        this.difficult = difficult;
    }

    public String getDifficult() {return difficult;}
    public void setDifficult(String difficult) {this.difficult = difficult;}

    public List<Recipe> getRecipes() {return recipes;}
    public void setRecipes(List<Recipe> recipes) {this.recipes = recipes;}
}
