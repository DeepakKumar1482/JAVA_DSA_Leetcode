import java.util.ArrayList;
import java.util.List;

public class leetcode343 {
    public static void main(String[] args) {
        int n=10;
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int i=4;i<=n;i++){
            int maxproduct=0;
            for(int j=1;j<=i/2;j++){
                int product=dp[j]*dp[i-j];
                maxproduct=Math.max(maxproduct,product);
            }
            dp[i]=maxproduct;
        }
        System.out.println(dp[n]);
    }
}
