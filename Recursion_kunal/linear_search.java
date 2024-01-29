package Recursion_kunal;

import java.util.ArrayList;
import java.util.List;

public class linear_search {
    public static void main(String[] args) {
        int []nums={6,9,3,8,14};
        minimizeArrayValue(nums);
    }
    public static int minimizeArrayValue(int[] nums) {
        int idx=0;
        int max=nums[0];
        int count=0;
        for(int num:nums){
            if(max<num){
                count++;
                break;
            }
        }
        if(count==0){
            return max;
        }
        for(int i=1;i<nums.length;i++){
            int currmax=0;
            int curridx=0;
            int j=1;
            while(nums[j]   >nums[0]){
                if(nums[j]-1>nums[0] && nums[j]>nums[0]){
                    currmax=nums[j];
                    curridx=j;
                    break;
                }
            }
            if(currmax==0){
                break;
            }
            nums[curridx-1]=nums[curridx-1]+1;
            nums[curridx]=nums[curridx]-1;
        }
        int ans=0;
        for(int num:nums){
            ans=Math.max(num,ans);
        }
        return ans;
    }
}
