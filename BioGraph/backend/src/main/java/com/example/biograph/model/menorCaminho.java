package com.example.biograph.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class menorCaminho {




    public static void addRelacao(ArrayList<ArrayList<Integer>> adj, int i, int j)
        {
            adj.get(i).add(j);
            adj.get(j).add(i);
        }


        public static void imprimeRelacoes(
                ArrayList<ArrayList<Integer>> adj,
                int s, int dest, int v)
        {
            int pred[] = new int[v];
            int dist[] = new int[v];

            if (BFS(adj, s, dest, v, pred, dist) == false) {
                System.out.println("Os seres:  " +
                        "não possuem relação");
                return;
            }

            // LinkedList to store path
            LinkedList<Integer> path = new LinkedList<Integer>();
            int crawl = dest;
            path.add(crawl);
            while (pred[crawl] != -1) {
                path.add(pred[crawl]);
                crawl = pred[crawl];
            }

            // Print distance
            System.out.println("O nível trófico desse animal é : " + dist[dest]);

            // Print path
            System.out.println("O fluxo de energia é :");
            for (int i = path.size() - 1; i >= 0; i--) {
                if(path.get(i)==0) System.out.print(" Produtor : "+path.get(i) + " ");
                else System.out.print(" Consumidor :" +path.get(i) + "---> ");
            }

        }


        private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
                                   int dest, int v, int pred[], int dist[])
        {

            LinkedList<Integer> queue = new LinkedList<Integer>();


            boolean visited[] = new boolean[v];


            for (int i = 0; i < v; i++) {
                visited[i] = false;
                dist[i] = Integer.MAX_VALUE;
                pred[i] = -1;
            }


            visited[src] = true;
            dist[src] = 0;
            queue.add(src);


            while (!queue.isEmpty()) {
                int u = queue.remove();
                for (int i = 0; i < adj.get(u).size(); i++) {
                    if (visited[adj.get(u).get(i)] == false) {
                        visited[adj.get(u).get(i)] = true;
                        dist[adj.get(u).get(i)] = dist[u] + 1;
                        pred[adj.get(u).get(i)] = u;
                        queue.add(adj.get(u).get(i));


                        if (adj.get(u).get(i) == dest)
                            return true;
                    }
                }
            }
            return false;
        }


    }



