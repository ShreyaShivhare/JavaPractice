package com.example.practice.graph;

import java.util.ArrayList;

//O(V+E)
//       1 __ __ 3
//      /        |  \ 
//    /          |    \ 
//   0           |      5 __ __ 6
//    \          |    /
//      \        |  /
//        2 __ __4 
public class DFS {

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
    
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.destination]==false){
              dfs(graph, e.destination,vis);
            }
        }
    }
    
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);
        // for(int i=0;i<graph[4].size();i++){
        //     Edge e = graph[4].get(i);
        //     System.out.println(e.destination+" ");
        // }
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                dfs(graph, i,vis);
            }
        }
        
        System.out.println();
    }
}
