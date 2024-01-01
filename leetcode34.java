import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirstOccurrence(nums, target);
        ans[1] = findLastOccurrence(nums, target);
        return ans;
    }

    private static int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
