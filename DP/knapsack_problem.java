package DP;

public class knapsack_problem {
    public static void main(String[] args) {
        int[] price={15,14,10,45,30};
        int [] weight={2,5,1,3,4};
        int n=5;
        int targetWeight=7;
        System.out.println(Knapsack(price,weight,targetWeight,n));
    }
    public static int Knapsack(int []price,int []weight,int target,int n){
        int [][]dp=new int[n+1][target+1];
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if(j<weight[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],(dp[i-1][j-weight[i-1]]+price[i-1]));
                }
            }
        }
        return dp[n][target];
    }
}
