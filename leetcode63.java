public class leetcode63 {
    public static void main(String[] args) {
        int [][]arr={{1,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int[][] dp = new int[n][c];
        if(obstacleGrid[0][0]!=1){
            dp[0][0]=1;
        }
        for (int i = 0; i <dp.length;i++){
            for (int j=0;j<c;j++){
                if(j>0 && i==0 && obstacleGrid[i][j]!=1){
                    dp[i][j]=dp[i][j-1];
                }
                else if( i>0 &&j==0 && obstacleGrid[i][j]!=1){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    if(obstacleGrid[i][j]!=1) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
        }
        return dp[n-1][c-1];
    }
}