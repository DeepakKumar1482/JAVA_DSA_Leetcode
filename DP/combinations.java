package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class combinations {
    public static void main(String[] args) {
        int []arr={2};
        int amount=3;
        System.out.println(amount_combinations(arr,amount));
    }
    public static int amount_combinations(int []coins,int amount){
        int []dp=new int[amount+1];
        dp[0]=0;
        for (int i=1;i<=amount;i++){
            dp[i]=amount+1;
        }
        for (int i=0;i<coins.length;i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]>=amount?-1:dp[amount];
    }
}
