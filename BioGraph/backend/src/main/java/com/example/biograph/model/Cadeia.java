package com.example.biograph.model;

import java.util.ArrayList;
import java.util.List;

public class Cadeia {
    List<List<Integer>> adjlist = new ArrayList<>();

    public Cadeia(List<RelacionamentoAlimentar> relacionamentos) {
        int n = 0;

        for (RelacionamentoAlimentar e : relacionamentos) {
            n = Integer.max(n, Integer.max(e.origem, e.destino));
        }
        for (int i = 0; i <= n; i++) {
            adjlist.add(i, new ArrayList<>());
        }
        for (RelacionamentoAlimentar current : relacionamentos) {
            adjlist.get(current.origem).add(current.destino);
        }
    }

    public static void imprimeCadeia(Cadeia graph) {
        int s = 0;
        int n = graph.adjlist.size();
        while (s < n) {
            for (int d : graph.adjlist.get(s)) {
                System.out.print("Relações alimentares:");

                System.out.print("(" + s + " -- > " + d + ")\t");
            }
            System.out.println();

            s++;
        }
    }
}
