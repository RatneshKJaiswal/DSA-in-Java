package Graphs;

import java.util.ArrayList;

public class bellmanFord {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int k=0; k<graph.length-1; k++) {
            for(int i =0; i<graph.length; i++) {
                for(int j=0; j<graph[i].size(); j++) {
                    Edge edge = graph[i].get(j);
                    int u = edge.src;
                    int v = edge.dest;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + edge.wt < dist[v]) {
                        dist[v] = dist[u] + edge.wt;
                    }
                }
            }
        }

        // negative weight cycle detection
        for(int i =0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge edge = graph[i].get(j);
                int u = edge.src;
                int v = edge.dest;

                if(dist[u] != Integer.MAX_VALUE && dist[u] + edge.wt < dist[v]) {
                    System.out.println("Negative weigh cycle detected");
                }
            }
        }

        for(int i=0; i<graph.length; i++) {
            System.out.println(i+"->"+dist[i]);
        }
    }
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        bellmanFord(graph, src);
    }
}
