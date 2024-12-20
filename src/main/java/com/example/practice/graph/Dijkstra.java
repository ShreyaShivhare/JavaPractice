package com.example.practice.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int wt){
            this.source = s;
            this.destination = d;
            this.weight = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; // ascending
            //return p2.dist - this.dist; //descending
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
               dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i= 0; i<graph[curr.node].size(); i++){

                } 
            }
        }

    }

    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, V, V);

    }
    
}
