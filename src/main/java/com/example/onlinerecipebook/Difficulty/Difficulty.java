package com.example.onlinerecipebook.Difficulty;

import javax.persistence.*;

@Entity
@Table
public class Difficulty {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String difficult;

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
