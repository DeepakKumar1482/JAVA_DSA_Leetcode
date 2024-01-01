package DP;

import java.util.Arrays;

public class Paint_House {
    public static void main(String[] args) {
        int [][]color_price={{1,5,7},
                             {5,8,9},
                             {3,2,9},
                             {1,2,4}};
        System.out.println(minimum_cost_Painting_house(color_price,3));
    }
    public static int minimum_cost_Painting_house(int[][]color_price,int colors){
        int n=color_price.length;
        int [][]dp=new int[n][colors];
        dp[0][0]=color_price[0][0];
        dp[0][1]=color_price[0][1];
        dp[0][2]=color_price[0][2];
        for(int i=1;i<n;i++){
            dp[i][0]=color_price[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=color_price[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=color_price[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
        }
        for (int i=0;i<n;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
    }
}
