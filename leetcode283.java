import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode283 {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int len = nums.length - 1;
        int zeros = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                n++;
            }
        }
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = nums.length - 1; i >= nums.length - zeros; i--) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
