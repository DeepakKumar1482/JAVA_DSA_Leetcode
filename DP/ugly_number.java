package DP;

public class ugly_number {
    public static void main(String[] args) {
        nthUglyNumber(12);
    }
    public static int nthUglyNumber(int n) {
        int []dp=new int[n];
        dp[0]=1;
        int i2=0,i3=0,i5=0;
        int nmof2=2;
        int nmof3=3;
        int nmof5=5;
        for(int i=1;i<n;i++){
            int nextugly=Math.min(Math.min(nmof2,nmof3),nmof5);
            dp[i]=nextugly;
            if(nextugly==nmof2){
                i2++;
                nmof2=dp[i2]*2;
            }
            if(nextugly==nmof3){
                i3++;
                nmof3=dp[i3]*3;
            }
            if(nextugly==nmof5){
                i5++;
                nmof5=dp[i5]*5;
            }
        }
        return dp[n-1];
    }
}
