package DP;

public class additive_number {
    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("112358"));
    }
    public static boolean isAdditiveNumber(String num) {
        if(num.length()<3){
            return false;
        }
        int []dp=new int[num.length()];
        dp[0]=num.charAt(0)-'0';
        if(num.length()>1) {
            dp[1] = num.charAt(1)-'0';
        }
        for (int i=2;i<num.length();i++){
            int sum=dp[i-2]+dp[i-1];
            if(sum!=num.charAt(i)-'0'){
                return false;
            }
            dp[i]=sum;
        }
        return true;
    }
}
