package com.example.onlinerecipebook;

import javax.persistence.*;

@Entity(name ="Recipe")
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(
            name = "recipe_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "recipe_image",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String image;


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
