package com.example.onlinerecipebook.Recipe;

import com.example.onlinerecipebook.Category.Category;
import com.example.onlinerecipebook.Cuisine.Cuisine;
import com.example.onlinerecipebook.Difficulty.Difficulty;
import com.example.onlinerecipebook.Ingridient.Ingredient;
import com.example.onlinerecipebook.Instruction.Instruction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String image;



    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "recipe"
    )
    private List<Ingredient> ingredients = new ArrayList<>();

    @OneToOne(
            mappedBy = "recipe",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}

    )
    private Instruction instruction;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(
            name = "difficult_id",
            foreignKey = @ForeignKey(
                    name = "recipe_difficult_id_fk"
            )
    )
    private Difficulty difficulty;



    @ManyToOne
    @MapsId("id")
    @JoinColumn(
            name = "cuisine_id",
            foreignKey = @ForeignKey(
                    name = "recipe_cuisine_id_fk"
            )
    )
    private Cuisine cuisine;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(
            name = "category_id",
            foreignKey = @ForeignKey(
                    name = "recipe_category_id_fk"
            )
    )
    private Category category;



    public Recipe(String name, String image) {
        this.name = name;
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
}
