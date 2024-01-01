import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {
    public static void main(String[] args) {
        int []arr={1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        int n=nums.length;
        for (int i=0;i<n-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j=i+1;j<n-2;j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int target2 = target - nums[i] - nums[j];
                int front = j + 1;
                int end = n - 1;
                while (front < end) {
                    int sum = nums[front] + nums[end];
                    if (sum < target2) {
                        front++;
                    } else if (sum > target2) {
                        end--;
                    } else {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[front]);
                        l.add(nums[end]);
                        list.add(l);
                        while (front < end && nums[front] == nums[front + 1]) {
                            ++front;
                        }
                        while (front < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        front++;
                        end--;
                    }
                }
            }
        }
        return list;
    }
}
