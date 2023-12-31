package DP;

import java.util.HashSet;

public class stair_path {
    public static void main(String[] args) {
       int []arr={3,2,4,2,0,2,3,1,2,2};
       AllPossiblePaths(arr,arr.length);
        System.out.println(MinimumSteps(arr,arr.length));
    }
    public static void AllPossiblePaths(int []arr,int n){
        int []dp=new int[n+1];
        dp[n]=1;
        for (int i=n-1;i>=0;i--){
            for (int j=1;j<=arr[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
//    Finding the minimum steps to react the top of the stair.
    public static int MinimumSteps(int []arr,int n){
        Integer []dp=new Integer[n+1];
        dp[n]=0;
        for (int i=n-1;i>=0;i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if(dp[i+j]!=null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if(min!=Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0];
    }
}
