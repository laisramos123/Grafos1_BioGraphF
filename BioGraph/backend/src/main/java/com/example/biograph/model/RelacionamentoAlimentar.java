package com.example.biograph.model;
import java.util.*;
public class RelacionamentoAlimentar {

        int origem, destino;
        public RelacionamentoAlimentar(int origem, int destino)
        {
            this.origem = origem;
            this.destino = destino;
        }

    public int getDestino() {
        return destino;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
}


