package com.example.biograph.model;

public class No_Animal {
    private String animalNome;
    private int nivelTrofico_id;
    public No_Animal(String animalNome, int nivelTrofico_id){
        this.animalNome = animalNome;
        this.nivelTrofico_id = nivelTrofico_id;
    }

    public String getanimalNome() {
        return animalNome;
    }
    public int getNivelTrofico_id() {
        return nivelTrofico_id;
    }

    public void setanimalNome(String animalNome) {
        this.animalNome = animalNome;
    }

    public void setNivelTrofico_id(int nivelTrofico_id) {
        this.nivelTrofico_id = nivelTrofico_id;
    }
}
