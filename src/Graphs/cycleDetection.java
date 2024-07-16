package Graphs;

import java.util.ArrayList;

public class cycleDetection {
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
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));

    }
    public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i< graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if(rec[edge.dest]){
                return true;
            } else if(!vis[edge.dest]){
                if(isCycleDirected(graph, vis, edge.dest, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for(int i=0;i< graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if(vis[edge.dest] && par!= edge.dest){
                return true;
            }
            else if(!vis[edge.dest]){
                if(isCycleUndirected(graph, vis, edge.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
//        boolean[] rec = new boolean[V];
//
//        for(int i=0;i<V;i++){
//            if(!vis[i]){
//                boolean isCycle = isCycleDirected(graph,vis,i,rec);
//                if(isCycle){
//                    System.out.println(isCycle);
//                    break;
//                }
//            }
//        }

        for(int i=0;i<V;i++){
            if(!vis[i]){
                System.out.println(isCycleUndirected(graph, vis, i, -1));
            }
        }
    }
}
