import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode31 {
    public static void main(String[] args) {
        int arr[]={1,1,5,4,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,end,start);
            end--;
            start++;
        }
    }
}
