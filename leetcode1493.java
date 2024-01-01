import java.util.*;

public class leetcode1493 {
    public static void main(String[] args) {
        int []arr={0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums){
        int n=nums.length;
        int right=0;
        int left=0;
        int max=0;
        int zero=0;
        while (right<n){
            if(nums[right]==0){
                zero++;
            }
            while (zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            max= Math.max(max,right-left);
            right++;
        }
        return max;
    }
}
