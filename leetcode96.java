public class leetcode96 {
    public static void main(String[] args) {
        System.out.println(numTrees(5));
    }
    public static int numTrees(int n) {
        if(n==0||n==1){
            return 1;
        }
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        int count=0;
        for (int i=2;i<=n;i++){
            int l=0;
            int r=i-1;
            while(l<=i-1){
                dp[i]+=dp[l]*dp[r];
                l++;
                r--;
            }
        }
       return dp[n];
    }
}
