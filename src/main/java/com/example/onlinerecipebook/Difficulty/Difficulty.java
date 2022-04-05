package com.example.onlinerecipebook.Difficulty;

import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Difficulty {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String difficult;



    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "difficulty"
    )
    private List<Recipe> recipe = new ArrayList<>();


    public Difficulty() {
    }

    public Difficulty(int id, String difficult) {
        this.id = id;
        this.difficult = difficult;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDifficult() {return difficult;}
    public void setDifficult(String difficult) {this.difficult = difficult;}
}
