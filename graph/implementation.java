package graph;

import java.util.*;

public class implementation {

//    THIS CLASS IS DEFINED FOR WEIGHTED GRAPHS
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt) {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
}
        public static void CreateGraph(ArrayList<Edge>graph[]){
        for ( int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }//0 2 3 8 6 9
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

//        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));
//      graph[2].add(new Edge(2,1,10));
//      graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,4,4));
//      graph[3].add(new Edge(3,2,-1));

//        graph[0].add(new Edge(4,3,2));
        graph[0].add(new Edge(4,1,-1));
    }
//    THIS CLASS IS DEFINED FOR NON-WEIGHTED GRAPHS
//    static class Edge{
//        int src;
//        int dest;
//        public Edge(int src,int dest){
//            this.src=src;
//            this.dest=dest;
//        }
//    }
//    public static void creategraph(ArrayList<Edge>graph[]){
//        for ( int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<Edge>();
//        }
//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,4));
//
//        graph[1].add(new Edge(1,0));
//        graph[1].add(new Edge(1,2));
//        graph[1].add(new Edge(1,4));
//
//        graph[2].add(new Edge(2,1));
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,2));
//
//        graph[4].add(new Edge(4,0));
//        graph[4].add(new Edge(4,1));
//        graph[4].add(new Edge(4,5));
//
//        graph[5].add(new Edge(5,4));
//    }
//    Breadth first search
    public static void Bfs(ArrayList<Edge>graph[],int v){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(0);
        while (!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for ( int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
//    DEPTH FIRST SEARCH
    public static void Dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for ( int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false) {
                Dfs(graph, e.dest, vis);
            }
        }
    }
//    ALL PATHS FROM SOURCE TO TARGET
    public static void SourceToTargetPath(ArrayList<Edge>graph[],int curr,boolean vis[],int target,String path){
//        vis[curr]=true;
        if(curr==target){
            System.out.println(path);
            return;
        }
        for ( int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                SourceToTargetPath(graph,e.dest,vis,target,path+e.dest);
                vis[curr]=false;
            }
        }
    }
//    CHECK WEATHER THE CYCLE EXISTS IN THE GRAPH OR NOT
    public static boolean IsCycle(ArrayList<Edge>graph[],boolean []vis,int curr,int par){
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest] &&e.dest!=par){
                return true;
            }
            else if(!vis[e.dest]){
                if(IsCycle(graph,vis,e.dest,curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist-p2.dist;
        }
    }
//    DIJKSTRA'S ALGORITHM FOR FINDING THE SHORTEST DISTANCE BETWEEN TWO NODES ACCORDING TO THE WEIGHT(DISTANCE).
    public static void DijkstraAlgo(ArrayList<Edge>graph[],int src,int V){
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int []dist=new int[V];
        for ( int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean []vis=new boolean[V];
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for (int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for ( int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void BellmanFord(ArrayList<Edge>graph[],int src,int V) {
        int dis[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        for (int k = 0; k < V - 1; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;
                    if (dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[v]) {
                        dis[v] = dis[u] + e.wt;

                    }
                }
            }
        }
        for (int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
    }
    public static void main(String[] args) {
        int V=5;//Number of Vertexes
        ArrayList<Edge>graph[]=new ArrayList[V];
//        creategraph(graph);
        CreateGraph(graph);
//        PRINT 2'S NEIGHBOURS
//        for (int i=0;i<graph[2].size();i++){
//            Edge e=graph[2].get(i);
//            System.out.print(e.dest+" ");
//        Bfs(graph,4);
        boolean []vis=new boolean[V];
//        IF THERE IS DISJOINT PARTS OF THE GRAPH
//        for (int i=0;i<V;i++){
//            if(vis[i]==false){
//                Dfs(graph,0,vis);
//            }
//        }
//
//        Dfs(graph,0,vis);
//        SourceToTargetPath(graph,0,vis,3,"0");
//        boolean ans=IsCycle(graph,vis,0,-1);
//        System.out.println(ans);
//          DijkstraAlgo(graph,0,V);
        BellmanFord(graph,0,V);
        }
    }



