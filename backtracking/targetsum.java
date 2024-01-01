package backtracking;

import java.util.ArrayList;

public class targetsum {
    static int count=0;
    public static void main(String[] args) {
        int []nums={1,1,1,1,1};
        findTargetSumWays(nums,3);
        System.out.println(count);
    }
    public static int findTargetSumWays(int[] nums, int target){
        helper(nums,target,0,0);
        return count;
    }
    public static void helper(int []nums,int target,int sum,int idx){
        if(idx==nums.length ){
            if(sum==target) {
                count++;
            }
            return;
        }
        helper(nums,target,sum+nums[idx],idx+1);
        helper(nums,target,sum-nums[idx],idx+1);
    }
}










