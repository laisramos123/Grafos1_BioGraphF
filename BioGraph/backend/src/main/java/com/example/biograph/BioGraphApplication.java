package com.example.biograph;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;

import static com.example.biograph.model.menorCaminho.addRelacao;
import static com.example.biograph.model.menorCaminho.imprimeRelacoes;


@SpringBootApplication
public class BioGraphApplication {

	public static void main(String[] args) {

        int v = 8;


        ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }


        addRelacao(adj, 1, 2);
        addRelacao(adj, 1, 3);
        addRelacao(adj, 2, 4);
        addRelacao(adj, 3, 5);

        int source = 1, dest = 5;
        imprimeRelacoes(adj, source, dest, v);

		SpringApplication.run(BioGraphApplication.class, args);

	}

}


