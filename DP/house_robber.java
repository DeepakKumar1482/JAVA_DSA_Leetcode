package DP;

public class house_robber {
    public static void main(String[] args) {
        int []arr={1,2,3,1};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[2]+dp[0];
        for(int i=3;i<nums.length;i++){
            int n1=nums[i]+dp[i-1]-nums[i-1];
            int n2=dp[i-2]+nums[i];
            dp[i]=Math.max(n1,n2);
        }
        int max=0;
        for(int i=0;i<dp.length;i++){
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
