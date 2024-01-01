package DP;

import java.util.Arrays;

public class maximal_square {
    public static void main(String[] args) {
        char [][]matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char a='1';

        maximalSquare(matrix);
    }
    public static int maximalSquare(char[][] matrix){
        int [][]dp=new int[matrix.length][matrix[0].length];
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(i==matrix.length-1){
                    dp[i][j]=matrix[i][j];
                }
                else if(j==matrix[0].length-1){
                    dp[i][j]=matrix[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j+1],Math.min(dp[i+1][j],dp[i+1][j+1]))+1;
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.print(Arrays.toString(dp[i]));
        }
        return 4;
    }
}
