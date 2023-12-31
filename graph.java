import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        String s="abc";
        
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
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
    public static void Bfs(ArrayList<Edge>[]graph,int v){
        Queue<Integer>q=new LinkedList<>();
        boolean []vis=new boolean[v];
        q.add(0);
        while (!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr +" ");
//                ArrayList<Integer>l=new ArrayList<>();
//                l.add(1);
//                l.get(0);
                vis[curr]=true;
                for (int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void Dfs(ArrayList<Edge>[]graph,int curr,boolean []vis){
        System.out.print(curr +" ");
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                Dfs(graph,e.dest,vis);
            }
        }
    }
    public static void AllPaths(ArrayList<Edge>[]graph,int curr,boolean []vis,int target,String path){
//        vis[curr]=true;
        if(curr==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr]=true;
                AllPaths(graph, e.dest, vis, target, path + e.dest+"->");
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int vertex=7;
        ArrayList<Edge>[]graph=new ArrayList[vertex];
        createGraph(graph);
//        Bfs(graph,vertex);
//        Dfs(graph,0,new boolean[vertex]);
        AllPaths(graph,0,new boolean[vertex],5,"0->");
    }
}
