package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimum_path_sum {
    public static void main(String[] args) {
        int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid){
        int [][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else if(j==grid[0].length-1){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
                else if(i==grid.length-1){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
                else {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
            }
        }
        for (int i=0;i<dp.length;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}