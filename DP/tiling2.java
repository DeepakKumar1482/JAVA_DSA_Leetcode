package DP;

import java.util.PriorityQueue;

public class tiling2 {
    public static void main(String[] args) {
        System.out.println(tiling_ways(8,3));
    }
    public static int tiling_ways(int n,int m){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int []dp=new int[n+1];
        for (int i=0;i<=n;i++){
            if(i<m){
                dp[i]=i;
            }else if(i==m){
                dp[i]=2;
            }else{
                dp[i]=dp[i-1]+dp[i-m];
            }
        }
        return dp[n];
    }
}
