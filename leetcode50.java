public class leetcode50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,5));
    }
    public static double myPow(double x, int n) {
        double ans=1;
        long copy=n;
        if(copy<0){
            copy=-copy;
        }
        while (copy>0){
            if(copy%2==1){
                ans=ans*x;
                copy=copy-1;
            }
            else{
                x=x*x;
                copy=copy/2;
            }
        }
        if(n<0){
            ans=1/ans;
        }
        return ans;
    }
}
