package com.example.onlinerecipebook.Recipe;

import com.example.onlinerecipebook.Category.Category;
import com.example.onlinerecipebook.Cuisine.Cuisine;
import com.example.onlinerecipebook.Difficulty.Difficulty;
import com.example.onlinerecipebook.Ingridient.Ingredient;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="recipes")
public class Recipe {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String instruction;
    private String image;

    @OneToMany(mappedBy = "recipes", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "category_name",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "difficult_name",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "difficult_id"))
    private List<Difficulty> difficulties;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "cuisine_name",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "cuisine_id"))
    private List<Cuisine> cuisines;


    public Recipe(String name,String  instruction,String image) {
        this.name = name;
        this.instruction = instruction;
        this.image = image;
    }

    public Recipe() {
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}

    public String getInstruction() {return instruction;}
    public void setInstruction(String instruction) {this.instruction = instruction;}

    public List<Category> getCategories() {return categories;}
    public void setCategories(List<Category> categories) {this.categories = categories;}

    public List<Difficulty> getDifficulties() {return difficulties;}
    public void setDifficulties(List<Difficulty> difficulties) {this.difficulties = difficulties;}

    public List<Cuisine> getCuisines() {return cuisines;}
    public void setCuisines(List<Cuisine> cuisines) {this.cuisines = cuisines;}
}
