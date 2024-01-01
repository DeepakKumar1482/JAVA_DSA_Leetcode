package Graph_revision;

import java.util.*;

public class introduction {
    static class Edge{
        int src;
        int dest;
        int wt;
//
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
        public static void createGraph(ArrayList<Edge>graph[],int V){
            for (int i=0;i<V;i++){
                graph[i]=new ArrayList<Edge>();
            }
//            THIS IS FOR UNWEIGHTED GRAPH
//            graph[0].add(new Edge(0,2));
//
//            graph[1].add(new Edge(1,2));
//            graph[1].add(new Edge(1,3));
//
//            graph[2].add(new Edge(2,0));
//            graph[2].add(new Edge(2,1));
//            graph[2].add(new Edge(2,3));
//
//            graph[3].add(new Edge(3,1));
//            graph[3].add(new Edge(3,2));

//            THIS IS FOR WEIGHTED GRAPH
//            graph[0].add(new Edge(0,1,2));
//            graph[0].add(new Edge(0,2,2));
//
//            graph[1].add(new Edge(1,0,10));
//            graph[1].add(new Edge(1,3,0));

//            graph[2].add(new Edge(2,0,2));
//            graph[2].add(new Edge(2,0,10));
//            graph[2].add(new Edge(2,4,-1));
//
//            graph[3].add(new Edge(3,1,2));
//            graph[3].add(new Edge(3,4,0));
//            graph[3].add(new Edge(3,5,-1));
//
//            graph[4].add(new Edge(4,2,2));
//            graph[4].add(new Edge(4,3,2));
//            graph[4].add(new Edge(4,5,2));
//
//            graph[5].add(new Edge(5,3,2));
//            graph[5].add(new Edge(5,4,2));
//            graph[5].add(new Edge(5,6,2));
//
//            graph[6].add(new Edge(6,5,2));
//            graph[0].add(new Edge(0,2,-1));
//
//            graph[1].add(new Edge(1,0,1));
//
//            graph[2].add(new Edge(2,3,2));

//            graph[3].add(new Edge(3,0,6));

//            graph[2].add(new Edge(2,3,-1));
//
//            graph[3].add(new Edge(3,1,1));
//
//            graph[4].add(new Edge(4,0,2));
//            graph[4].add(new Edge(4,1,3));
//
//            graph[5].add(new Edge(5,0,4));
//            graph[5].add(new Edge(5,2,5));
//            graph[0].add(new Edge(0,1,10));
//            graph[0].add(new Edge(0,2,15));
//            graph[0].add(new Edge(0,3,30));

//            graph[1].add(new Edge(1,3,7));
//            graph[1].add(new Edge(1,0,10));
//            graph[1].add(new Edge(1,3,40));
//
//            graph[2].add(new Edge(2,0,15));
//            graph[2].add(new Edge(2,3,50));

//            graph[3].add(new Edge(3,0,30));
//            graph[3].add(new Edge(3,1,40));
//            graph[3].add(new Edge(3,2,50));
//            graph[4].add(new Edge(4,5,5));

//            graph[0].add(new Edge(0,2,1));
//            graph[0].add(new Edge(0,3,1));
//
//            graph[1].add(new Edge(1,0,3));
//
//            graph[2].add(new Edge(2,1,6));
//
//            graph[3].add(new Edge(3,4,4));

            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,2));
            graph[0].add(new Edge(0,3,3));

            graph[1].add(new Edge(1,0,4));
            graph[1].add(new Edge(1,2,1));

            graph[2].add(new Edge(2,0,0));
            graph[2].add(new Edge(2,1,5));

            graph[3].add(new Edge(3,0,6));
            graph[3].add(new Edge(3,4,9));
            graph[3].add(new Edge(3,5,12));

            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,7));

            graph[5].add(new Edge(5,3,3));
            graph[5].add(new Edge(5,4,2));
        }
//        BREADTH FIRST SEARCH OR BREADTH FIRST TRAVERSAL
        public static void BreadthFirstSearch(ArrayList<Edge>[]graph,int V,boolean vis[],int start){
            Queue<Integer>q=new LinkedList<>();
//            THIS VISITED ARRAY WILL BE CREATED IN THE MAIN FUNCTION IF THE GRAPH IS IN FORM OF DISCONNECTED CHUNKS
//            boolean []vis=new boolean[V];
            q.add(start);
            while(!q.isEmpty()){
                int curr=q.remove();
                if(vis[curr]==false){
                    System.out.print(curr+" ");
                    vis[curr]=true;
                    for (int i=0;i<graph[curr].size();i++){
                        Edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }
        public static void DepthFirstSearch(ArrayList<Edge>[]graph,int curr,boolean []vis){
            System.out.print(curr+" ");
            vis[curr]=true;
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(vis[e.dest]==false) {
                    DepthFirstSearch(graph, e.dest, vis);
                }
            }
        }
//        FIND ALL THE PATHS FROM SOURCE TO DESTINATION
        public static void AllPaths(ArrayList<Edge>[]graph, boolean []vis, int curr, String path,int dest){
            if(curr==dest){
                System.out.println(path+dest);
                return;
            }
//            path+=Integer.toString(curr);
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(vis[e.dest]==false){
                    vis[curr]=true;
                    AllPaths(graph,vis,e.dest,path+Integer.toString(curr)+"->",dest);
                    vis[curr]=false;
                }
            }
        }
        public static boolean CycleChecker(ArrayList<Edge>[]graph,boolean []vis,int curr,boolean []stack){
            vis[curr]=true;
            stack[curr]=true;
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(stack[e.dest]){
                    return true;
                }
                else if(!vis[e.dest]){
                    if(CycleChecker(graph,vis, e.dest, stack)){
                        return true;
                    }
                }
            }
            stack[curr]=false;
            return false;
        }
//        TOPOLOGICAL SORT (THIS GIVES A SEQUENCE OF ELEMENTS PRESENT IN THE GRAPH
        public static void TopologicalUtil(ArrayList<Edge>[]graph, boolean vis[], int curr, Stack<Integer>stack){
            vis[curr]=true;
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    TopologicalUtil(graph,vis,e.dest,stack);
                }
            }
            stack.push(curr);
        }
        public static void TopologicalSort(ArrayList<Edge>[]graph,int V){
            boolean vis[]=new boolean[V];
            Stack<Integer>stack=new Stack<>();
            for (int i=0;i<V;i++){
                if(!vis[i]) {
                    TopologicalUtil(graph, vis, i, stack);
                }
            }
            while (!stack.isEmpty()){

                System.out.print(stack.pop()+" ");

            }
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
//        PriorityQueue<Pair>pq=new PriorityQueue<>();
//        int dis[]=new int[V];
//
//            for ( int i=0;i<V;i++){
//            if(i!=src){
//                dis[i]=Integer.MAX_VALUE;
//            }
//
//        }


        public static void Dijkstra(ArrayList<Edge>[]graph,int src,int V){
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        boolean []vis=new boolean[V];
        int []dis=new int[V];
        for ( int i=0;i<V;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for ( int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(dis[u]+e.wt<dis[v]){
                        dis[v]=dis[u]+e.wt;
                        pq.add(new Pair(v,dis[v]));
                    }
                }
            }
        }
        for ( int i=0;i<V;i++){
            System.out.print(dis[i]+" ");
        }
        }
//        THIS ALGORITHM IS ALSO USED TO FIND THE MINIMUM DISTANCE BETWEEN TWO VERTEXES (NODES)
//        BUT IF THE WEIGHT (DISTANCE) IS NEGATIVE IN THE GRAPH THEN DIJKSTRA ALGORITHM DOES NOT WORK CORRECTLY
        public static void BellmenFord(ArrayList<Edge>[]graph,int src,int V){
            int []dis=new int[V];
            for ( int i=0;i<V;i++){
                if (i!=src){
                    dis[i]=Integer.MAX_VALUE;
                }
            }
            for (int i=0;i<V-1;i++){
                for (int j=0;j<V;j++){
                    for ( int k=0;k<graph[i].size();k++){
                        Edge e=graph[i].get(j);
                        int u=e.src;
                        int v=e.dest;
                        if(dis[u]!=Integer.MAX_VALUE &&dis[u]+e.wt<dis[v]){
                            dis[v]=dis[u]+e.wt;
                        }
                    }

                }
            }
            for ( int i=0;i<V;i++){
                System.out.print(dis[i]+" ");
            }
        }
//        PRIM'S ALGORITHM FOR FINDING THE MINIMUM SPANNING TREE
//        THIS IS TRUE ONLY FOR UNDIRECTED GRAPHS AND THERE ARE SOME CONDITIONS FOR A GRAPH
//        TO BE A MINIMUM SPANNING TREE FOLLOWING CONDITIONS MUST BE FULL FILLED =>
//        1.THERE SHOULD NOT BE ANY CYCLE PRESENT IN THE GRAPH
//        2.EACH AND EVERY NODE MUST BE CONNECTED TO GRAPH
//        3.THE WEIGHT OF THE SPANNING TREE MUST BE MINIMUM THEN ONLY THAT IS CALLED A MINIMUM SPANNING TREE
        public static int PrimsAlgorithm(ArrayList<Edge>[]graph,int V,int src,int cost){
            PriorityQueue<Pair>pq=new PriorityQueue<>();
            boolean []vis=new boolean[V];
            pq.add(new Pair(0,0));
            while (!pq.isEmpty()){
                Pair curr=pq.remove();
                if(!vis[curr.node]){
                    vis[curr.node]=true;
                    cost+=curr.dist;
                    for (int i=0;i<graph[curr.node].size();i++){
                        Edge e=graph[curr.node].get(i);
                        if(!vis[e.dest]) {
                            pq.add(new Pair(e.dest, e.wt));
                        }
                    }
                }
            }
            return cost;
        }
//        KOSARAJU'S ALGORITHM IS FOR FINDING THE STRONGLY CONNECTED NODE
//        STRONGLY CONNECTED NODE ARE THOSE NODES - THROUGH ANY NODE OF THE STRONGLY CONNECTED NODE YOU CAN REACH
//        EACH AND EVERY NODE OF THAT STRONGLY CONNECTED NODES GROUP.
        public static void KosarajuAlgo(ArrayList<Edge>[]graph,int V){
            Stack<Integer>s=new Stack<>();
            boolean []vis=new boolean[V];
            for (int i=0;i<V;i++){
                if(!vis[i]){
                    topsort(graph,i,vis,s);
                }
            }

            ArrayList<Edge>[]transpose=new ArrayList[V];
            for (int i=0;i<V;i++){
                vis[i]=false;
                transpose[i]=new ArrayList<>();
            }
            for (int i=0;i<V;i++){
                for (int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    transpose[e.dest].add(new Edge(e.dest,e.src,e.src+3));
                }
            }
            while (!s.isEmpty()){
                int curr=s.pop();
                if(!vis[curr]){
                    dfs(graph,curr,vis);
                }
                System.out.println();
            }
        }
        public static void dfs(ArrayList<Edge>[]graph,int curr,boolean []vis){
            vis[curr]=true;
            System.out.print(curr+" ");
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    dfs(graph,e.dest,vis);
                    System.out.println();
                }
            }
        }
        public static void topsort(ArrayList<Edge>[]graph,int curr, boolean []vis, Stack<Integer>s){
            vis[curr]=true;
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if (!vis[e.dest]){
                    topsort(graph,e.dest,vis,s);
                }
            }
            s.push(curr);
        }
        public static void Depthfirst(ArrayList<Edge>[]graph,int curr,boolean []vis,int []dt,int []low,int time,int par){
            vis[curr]=true;
            dt[curr]=low[curr]=++time;
            for (int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(e.dest==par){
                    continue;
                } else if (!vis[e.dest]) {
                    Depthfirst(graph,e.dest,vis,dt,low,time,curr);
                    low[curr]=Math.min(low[curr],low[e.dest]);
                    if(dt[curr]<low[e.dest]){
                        System.out.println("Bride is ->  "+curr+"----"+e.dest);
                    }
                }
                else{
                    low[curr]=Math.min(low[curr],dt[e.dest]);
                }
            }
        }
        public static void GetBridge(ArrayList<Edge>[]graph,int V){
            int []dt=new int[V];
            int []low=new int[V];
            int time=0;
            boolean []vis=new boolean[V];
            for (int i=0;i<V;i++){
                if(!vis[i]){
                    Depthfirst(graph,i,vis,dt,low,time,-1);
                }
            }
        }
        public static void main(String[] args) {
        int V=6;
            ArrayList<Edge>graph[]=new ArrayList[V];
            createGraph(graph,V);
            GetBridge(graph,V);
//            KosarajuAlgo(graph,V);
//            for (int i=0;i<graph[2].size();i++){
//                System.out.print(graph[2].get(i).dest+" => "+graph[2].get(i).wt+" ");
//            }
//            boolean []vis=new boolean[V];
//            boolean []stack=new boolean[V];
//            for (int i=0;i<V;i++) {
//                if(!vis[i]) {
//                 boolean ans=(CycleChecker(graph, vis, 0, stack));
//                 if(ans){
//                     System.out.println(ans);
//                     break;
//                 }
//                }
//            }
//            System.out.println(PrimsAlgorithm(graph,V,0,0));
//            Dijkstra(graph,0,V);
//           TopologicalSort(graph,V);
//            AllPaths(graph,vis,0,"",
//            5);
//            for ( int i=0;i<V;i++){
//                if(vis[i]==false)
//                    BreadthFirstSearch(graph,V,vis,i);
//                    DepthFirstSearch(graph,i,vis);
//            }
        }
    }
}

