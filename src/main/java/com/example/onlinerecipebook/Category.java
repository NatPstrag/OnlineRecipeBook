package com.example.onlinerecipebook;


import javax.persistence.*;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
}
