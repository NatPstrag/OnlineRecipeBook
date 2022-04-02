package com.example.onlinerecipebook;

import javax.persistence.*;

@Entity
@Table
public class Recipe {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
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
