package Recursion_kunal.Backtracking;

public class alldirectionsMaze {
    public static void main(String[] args) {
        boolean [][]visited=new boolean[3][3];
        helper(0,0,visited,"");
    }
    public static void helper(int r,int c,boolean [][]visited,String p){
        int rl=visited.length-1;
        int cl=visited[0].length-1;
        if(r==visited.length-1 && c==visited[0].length-1){
            System.out.println(p);
            return;
        }
        if(visited[r][c]){
            return;
        }
        visited[r][c]=true;
        if(r<rl){
            helper(r+1,c,visited,p+'D');
        }
        if(c<cl){
            helper(r,c+1,visited,p+'R');
        }
        if(r>0){
            helper(r-1,c,visited,p+'U');
        }if(c>0){
            helper(r,c-1,visited,p+'L');
        }
        visited[r][c]=false;
    }
}
