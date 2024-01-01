package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class perfectsqueares {
    public static void main(String[] args) {
        System.out.println( numSquares(43));

//        System.out.println((int)Math.sqrt(12));
    }
    public static int numSquares(int n) {
        int l=(int)Math.sqrt(n);
        int [][]dp=new int [l+1][n+1];
        dp[0][0]=0;
        int c=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }
                else if(j==0 && (int) Math.sqrt(i) == Math.sqrt(i)){
                    dp[c][j]=0;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(i==1){
                    dp[i][j]=j;
                }
                else {
                    if ((int) Math.sqrt(i) == Math.sqrt(i)) {
                        if (i <= j) {
                            if(j%i==0){
                                dp[c][j]=j/i;
                            }else {
                                dp[c][j] = j / i + dp[c][j % i];
                            }
                        } else {
                            dp[c][j] = dp[c - 1][j];
                        }
                    }
                    else{
                        break;
                    }
                }
            }
            if((int) Math.sqrt(i) == Math.sqrt(i)) {
                c++;
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<dp.length;i++){
            min=Math.min(min,dp[i][n]);
        }
        return min;
    }
}
