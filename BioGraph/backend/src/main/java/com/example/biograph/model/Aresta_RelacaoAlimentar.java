package com.example.biograph.model;

public class Aresta_RelacaoAlimentar {
    private No_Animal animalFonte;
    private No_Animal animalDestino;
    private double peso;
    public Aresta_RelacaoAlimentar(No_Animal animalFonte, No_Animal animalDestino,double peso){
        this.animalFonte=animalFonte;
        this.animalDestino=animalDestino;
        this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }

    public No_Animal getAnimalFonte() {
        return animalFonte;
    }
    public No_Animal getAnimalDestino() {
        return animalDestino;
    }

    public void setAnimalFonte(No_Animal animalFonte) {
        this.animalFonte = animalFonte;
    }

    public void setAnimalDestino(No_Animal animalDestino) {
        this.animalDestino = animalDestino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
