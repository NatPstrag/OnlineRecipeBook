package com.example.onlinerecipebook.Instruction;

import com.example.onlinerecipebook.Recipe.Recipe;

import javax.persistence.*;

@Entity
@Table
public class Instruction {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "instruction",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String instruction;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "recipe_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "recipe_id_fk"
            )
    )
    private Recipe recipe;




    public Instruction(String instruction) {
        this.instruction = instruction;
    }

    public Instruction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
