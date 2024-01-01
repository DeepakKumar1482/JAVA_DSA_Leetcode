package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascal_triangle2 {
    public static void main(String[] args) {
        getRow(3);
    }
    public static void getRow(int rowIndex){
        int [][]dp=new int[rowIndex+1][rowIndex+1];
        dp[0][0]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        for(int i=2;i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        List<Integer>ans=new ArrayList<>();
        for ( int i=rowIndex;i<=rowIndex;i++){
            for (int j=0;j<=rowIndex;j++){
                ans.add(dp[i][j]);
            }
        }
        System.out.println(ans);
    }
}
