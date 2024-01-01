import java.util.ArrayList;
import java.util.Arrays;

public class leetcode209 {
    public static void main(String[] args) {
        int []arr={12,28,83,4,25,26,25,2,25,25,25,12};
        int ans=minSubArrayLen(213,arr);
        System.out.println(ans);
//        {1,2,2,3,3,4};
    }
    public static int minSubArrayLen(int target, int[] nums){
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length && nums[nums.length-1]>=target;i++){
//            if(nums[i]>=target){
//                return 1;
//            }
//        }
//        int sum=0;
//        int count=0;
//        for ( int i=nums.length-1;i>=0;i--) {
//         if(sum<=target){
//             sum+=nums[i];
//             count++;
//         }
//         if(sum>=target){
//             return count;
//         }
//        }
//        return 0;
