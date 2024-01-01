package DP;

public class subsets {
    public static void main(String[] args) {
        int number_of_players=4;
        int number_of_teams=3;
        System.out.println(number_of_subsets(number_of_players,number_of_teams));
    }
    public static int number_of_subsets(int players,int teams){
        if(players==0 || teams==0 ||players<teams){
            return 0;
        }
        int [][]dp=new int[teams+1][players+1];
        for (int t=1 ;t<=teams;t++){
            for(int p=1;p<=players;p++){
                if(p<t){
                    dp[t][p]=0;
                }
                else if(p==t){
                    dp[t][p]=1;
                }
                else{
                    dp[t][p]=dp[t-1][p-1]+dp[t][p-1]*t;
                }
            }
        }
        return dp[teams][players];
    }
}
