package DP;

import java.util.List;

public class permutations {
    public static void main(String[] args) {
        int []coins={2,3,5,6};
        System.out.println(permute(coins,10));
    }
    public static int permute(int[] coins,int target) {
        int []dp=new int[target+1];
        dp[0]=1;
        for (int amt=1;amt<=target;amt++){
            for (int coin:coins){
                if(coin<=amt){
                    dp[amt]+=dp[amt-coin];
                }
            }
        }
        return dp[target];
    }
}
