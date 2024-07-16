package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {

    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,0));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,1));
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for(int i=0;i< graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if(!vis[edge.dest]){
                topSort(graph, edge.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        // This step helps when there are disjoint graphs
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topSort(graph,i,visited,stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print("["+stack.pop()+"] ");
        }
    }
}
