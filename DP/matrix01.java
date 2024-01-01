package DP;

import java.util.Arrays;

public class matrix01 {
    public static void main(String[] args) {
        int [][]mat={{0,0,0},{0,1,0},{1,1,1}};
        updateMatrix(mat);
    }
    public static int[][] updateMatrix(int[][] mat){
        int [][]dp=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==0 && mat[i][j]==1){
                    for(int l=j;l<mat.length;l++){
                        for (int b=1;b<mat[0].length;b++){
                            if(mat[l][b]==0){
                                dp[i][j]=l+b;
                            }
                        }
                    }
                }
                else if(mat[i][j]==1 && i==mat.length-1){
                    dp[i][j]=dp[i-1][j]+1;
                }
                else if(mat[i][j]==1 && j==0){
                    dp[i][j]=dp[i-1][j]+1;
                }
                else if(mat[i][j]==1 && j==mat[0].length-1){
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j]);
                }
                else if(mat[i][j]==1){
                    dp[i][j]=Math.min(Math.min(Math.min(dp[i][j-1],dp[i][j+1]),dp[i-1][j]),dp[i+1][j])+1;
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp;
    }
}
//&& i!=0 && j!=0 && i!=mat.length-1 && j!=mat[0].length-1
