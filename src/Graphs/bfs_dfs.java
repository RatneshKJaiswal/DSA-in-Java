package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_dfs {
    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));

        graph[6].add(new Edge(6,5));
    }

    public static void bfs(ArrayList<Edge>[] graph, int V,boolean[] visited, int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    if(!visited[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph,e.dest,visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        // This step helps when there are disjoint graphs
        for(int i=0;i<V;i++){
            if(!visited[i]){
                bfs(graph,V,visited,i);
            }
        }
        System.out.println(" ");

        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,0,vis);
            }
        }
    }
}
