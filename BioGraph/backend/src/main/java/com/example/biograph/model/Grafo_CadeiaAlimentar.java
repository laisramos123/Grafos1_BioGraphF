package com.example.biograph.model;
import java.util.*;
public class Grafo_CadeiaAlimentar <T> {

        //creating an object of the Map class that stores the edges of the graph
        private Map<T, List<T> > cadeaAlimentar = new HashMap<>();

        public void addNovoAnimal(T s)
        {
            cadeaAlimentar.put(s, new LinkedList<T>());
        }

        public void addNovoRelacionamentoAlimentar(T noOrigem, T noDestino, boolean biredicional)
        {
//
            if (!cadeaAlimentar.containsKey(noOrigem))
                addNovoAnimal(noOrigem);
            if (!cadeaAlimentar.containsKey(noDestino))
                addNovoAnimal(noDestino);
            cadeaAlimentar.get(noOrigem).add(noDestino);
            if (biredicional == true)
            {
                cadeaAlimentar.get(noDestino).add(noOrigem);
            }
        }

        public void tamanhoDaCaadeia()
        {
            System.out.println("O tamanhdo da cadeia alimentar é: "+ cadeaAlimentar.keySet().size());
        }
        //the method counts the number of edges
        public void countEdges(boolean bodirecional)
        {
//variable to store number of edges
            int count = 0;
            for (T v : cadeaAlimentar.keySet())
            {
                count = count + cadeaAlimentar.get(v).size();
            }
            if (bodirecional == true)
            {
                count = count / 2;
            }
            System.out.println("Total number of edges: "+ count);
        }

        public void temAnimal(T s)
        {
            if (cadeaAlimentar.containsKey(s))
            {
                System.out.println("A cadeia não possui : "+ s + " como animal");
            }
            else
            {
                System.out.println("A cadeia não contém "+ s + " como animal.");
            }
        }

        public void possuiRelacionamentAlimentar(T s, T d)
        {
            if (cadeaAlimentar.get(s).contains(d))
            {
                System.out.println("O ser "+ s + " e " + d + "possuem relação alimentar.");
            }
            else
            {
                System.out.println("O ser  "+ s + " e " + d + "não possuem relacionamento alimentar.");
            }
        }

        @Override
        public String toString()
        {
            StringBuilder construtor = new StringBuilder();

            for (T v : cadeaAlimentar.keySet())
            {
                construtor.append(v.toString() + ": ");

                for (T w : cadeaAlimentar.get(v))
                {
                    construtor.append(w.toString() + " ");
                }
                construtor.append("\n");
            }
            return (construtor.toString());
        }

}
