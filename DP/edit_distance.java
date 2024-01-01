package DP;

import java.util.ArrayList;

public class edit_distance {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        System.out.println(minDistance(word1,word2));
        ArrayList<Integer>l=new ArrayList<>();
    }
    public static int minDistance(String word1, String word2){
        int [][]dp=new int[word1.length()+1][word2.length()+1];
//        dp[0][0]=0;
        for(int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]=i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
