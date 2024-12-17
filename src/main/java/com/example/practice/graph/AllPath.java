package com.example.practice.graph;

import java.util.ArrayList;

//All path from source to target
//using DFS
//       1 __ __ 3
//      /        |  \ 
//    /          |    \ 
//   0           |      5 __ __ 6
//    \          |    /
//      \        |  /
//        2 __ __4 

public class AllPath {

    static class Edge{
        int Source;
        int destination;

        public Edge(int s, int d){
           this.Source = s;
           this.destination = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
        
    }

    public static void allPath(ArrayList<Edge> graph[], boolean vis[], int curr, int target, String path){
        if(curr == target){
          System.out.println(path);
          return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                vis[curr] = true;
               allPath(graph, vis, e.destination, target, path+e.destination);
                vis[curr] = false;
            }
        }

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int source = 0, target = 5; 
        allPath(graph, new boolean[V], source, target, "0");
        
    }
    
}
