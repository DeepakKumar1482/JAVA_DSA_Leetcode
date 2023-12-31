package DP;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(helper("aacabdkacaa"));
    }
    public static int helper(String str){
        boolean [][]dp=new boolean[str.length()][str.length()];
        int len=0;
        for (int g=0;g<str.length();g++){
            for (int i=0,j=g;j<str.length();i++,j++){
                if(i==0){
                    dp[i][j]=true;
                }else if(g==1){
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(str.charAt(i)==str.charAt(j) && dp[i-1][j-1]){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }
                if (dp[i][j]){
                    len=g+1;
                }
            }
        }
        return len;
    }
}
