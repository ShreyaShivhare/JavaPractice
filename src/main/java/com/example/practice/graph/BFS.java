package com.example.practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	static class Edge {
		int source;
		int destination;
		//int weight;
		
		public Edge(int s, int d){
            this.source = s;
            this.destination = d;
            //this.weight = wt;
        }
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
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
	
	public static void bfs(ArrayList<Edge>[] graph, int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		 boolean isVisited[] = new boolean[V];
	        queue.add(0);
	        while(!queue.isEmpty()){
	            int curr = queue.remove();
	            if(isVisited[curr] == false){

	               System.out.print(curr+" ");//step 1
	               isVisited[curr] = true;//step2
	               //step3
	               for(int i=0; i<graph[curr].size(); i++){
	                  Edge e = graph[curr].get(i);
	                  queue.add(e.destination);
	               }
	            }
	        }
	}
	

	public static void main(String args[]) {
		int V = 7;
		ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph, V);
        System.out.println();
	}

	
}


