package backtracking;

import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class goldmine {
    public static void main(String[] args) {
        int [][]grid={
                {0,6,0},
                {5,8,7},
                {0,9,0}};
        int answer=getMaximumGold(grid);
        System.out.println(answer);
    }
    public static int getMaximumGold(int[][] grid){
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        int max=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                ArrayList<Integer>bag=new ArrayList<>();
                if(grid[i][j]!=0 && !visited[i][j]){
                    helper(grid,i,j,bag,visited);
                }
                int sum=0;
                for(int num:bag){
                    sum+=num;
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    public static void helper(int [][]grid, int i, int j, ArrayList<Integer>bag,boolean [][]visited){
        if(i<0 ||j<0 ||i>=grid.length|| j>=grid[i].length || grid[i][j]==0 || visited[i][j]){
            return;
        }
        bag.add(grid[i][j]);
        visited[i][j]=true;
        helper(grid,i-1,j,bag,visited);
        helper(grid,i,j+1,bag,visited);
        helper(grid,i,j-1,bag,visited);
        helper(grid,i+1,j,bag,visited);
    }
}














