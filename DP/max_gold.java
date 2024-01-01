package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class max_gold {
    public static void main(String[] args) {
        int[][] goldMine = {
                {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}
        };
        int n=4,m=4;
        System.out.println(Maximum_Gold(goldMine,n,m));
    }
    public static int Maximum_Gold(int [][]grid,int n,int m){
        int[][]dp=new int[n][m];
        for (int j=m-1;j>=0;j--){
            for (int i=n-1;i>=0;i--){
                if(j==m-1){
                    dp[i][j]=grid[i][j];
                }
                else if(i==0){
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+grid[i][j];
                }
                else if(i==n-1){
                    dp[i][j]=Math.max(dp[i-1][j+1],dp[i][j+1])+grid[i][j];
                }
                else{
                    dp[i][j]=Math.max(Math.max(dp[i][j+1],dp[i-1][j+1]),dp[i+1][j+1])+grid[i][j];
                }
            }
        }
        int max=0;
        for (int i=0;i<n;i++){
            System.out.println(Arrays.toString(dp[i]));
            for ( int j=0;j<m;j++){
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
