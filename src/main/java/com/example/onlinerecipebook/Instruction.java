package com.example.onlinerecipebook;

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
