package Binary_Search;

import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int []arr={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                // if()
                arr[0]=mid;
                if(mid>0 && nums[mid-1]==target){
                    arr[1]=mid-1;
                }else if(mid<nums.length-1 && nums[mid+1]==target){
                    arr[1]=mid+1;
                }
                break;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
