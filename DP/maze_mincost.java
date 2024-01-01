package DP;

public class maze_mincost {
    public static void main(String[] args) {
        int [][]arr={
                {1, 3, 1},
                {2, 5, 2},
                {2, 1, 1}
        };
        int n=arr.length;
        int m=arr[0].length;
        System.out.println(Minimum_cost(arr,n,m));
    }
    public static int Minimum_cost(int [][]arr,int n,int m){
        int [][]dp=new int[n][m];
//        dp[n-1][m-1]=arr[n-1][m-1];
        for (int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j-- ){
                if(i==n-1 && j==m-1){
                    dp[i][j]=arr[i][j];
                }
               else if(i==n-1 && j<m-1){
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                else if(j==m-1 && i<n-1){
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
