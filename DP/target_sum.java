package DP;

import java.util.Arrays;

public class target_sum {
    public static void main(String[] args) {
        int []val={4,2,7,1,3};
        System.out.println(Target_Sum_Subset(val,10));
    }
    public static boolean Target_Sum_Subset(int []val,int target){
        boolean [][]dp=new boolean[val.length+1][target+1];
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }
                    else{
                        int value=val[i-1];
                        if(j >= value){
                            if(dp[i-1][j-value]==true){
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }
        for (int i=0;i<dp.length;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[val.length][target];
    }
}
