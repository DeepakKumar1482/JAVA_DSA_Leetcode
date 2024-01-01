package DP;

public class combination_sum_IV {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        String a="1";
        System.out.println(Combinations(arr,4));
    }
    public static int Combinations(int arr[],int target){
        int []dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
             for(int j=0;j<arr.length;j++){
                if(i>=arr[j]){
                    dp[i]=dp[i]+dp[i-arr[j]];
                }
            }
        }
        return dp[target];
    }
}
