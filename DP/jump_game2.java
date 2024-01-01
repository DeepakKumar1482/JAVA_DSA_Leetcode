package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class jump_game2 {
    public static void main(String[] args) {
        int []nums={2,3,0,1,4};
        minimum_jumps(nums);
    }
    public static int minimum_jumps(int []nums){
        int n=nums.length;
        int []dp=new int[n];
        dp[n-1]=0;
        dp[n-2]=1;
        for (int i=n-3;i>=0;i--){
            int min=Integer.MAX_VALUE-1;
            for(int j=i+1;j<n && j<=i+nums[i];j++){
                if(dp[j]<min){
                    min=dp[j];
                }
            }
            dp[i]=min+1;
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}
