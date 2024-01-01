package DP;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.HashSet;

public class decode_ways {
    public static void main(String[] args) {
        System.out.println(Decode_ways("21123"));

    }
    public static int Decode_ways(String str){
        int []dp=new int[str.length()];
        dp[0]=1;
        for (int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr=='0' && prev=='0'){
                dp[i]=0;
            }
            else if(prev=='0' && curr!='0'){
                dp[i]=dp[i-1];
            }
            else if(prev!='0' && curr==0){
                if(prev =='1' || prev=='2'){
                    dp[i]=(i>=2?dp[i-2]:1);
                }
                else{
                    dp[i]=0;
                }
            }
            else{
                if(Integer.parseInt(str.substring(i-1,i+1))<=26){
                    dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
                }
                else{
                    dp[i]=dp[i-1];
                }
            }
        }
        return dp[str.length()-1];
    }
}
