package DP;
//In this problem you have given a price array and one weight array with same length and have given a cap
//we have to find what is the maximum price we can get by putting the elements whose weight sum is equals to cap
//sum, we can use a element more than once also
public class Unbounded_knapsack {
    public static void main(String[] args) {
        int []price={15,14,10,45,30};
        int []weight={2,5,1,3,4};
        int cap=7;
        System.out.println(unbounded_knap(price,weight,cap));
    }
    public static int unbounded_knap(int []price,int []weight,int cap){
        int []dp=new int[cap+1];
        dp[0]=0;
        for (int bagc=1;bagc<dp.length;bagc++){
            int max=0;
            for (int i=0;i<price.length;i++){
                if(weight[i]<=bagc){
                    max=Math.max(max,dp[bagc-weight[i]]+price[i]);
                }
            }
            dp[bagc]=max;
        }
        return dp[cap];
    }
}
