package com.engeto;
import java.time.LocalDate;

public class Guests {
    private String name;
    private LocalDate dateOfBirth;


    public Guests(String name, LocalDate dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    }

    public String getDescription(){
        return name +" was born "+ dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

