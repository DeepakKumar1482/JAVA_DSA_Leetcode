package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static backtracking.subarrays.list;

public class longestIncreasing_subsequnce {
    public static void main(String[] args) {
        int []nums={10,9,2,5,3,7,101,18};
//        int []nums={0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []dp=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int ans=0;
        for (int num:dp){
            ans=Math.max(ans,num);
        }
        System.out.println(Arrays.toString(dp));
        return ans+1;
    }
}
