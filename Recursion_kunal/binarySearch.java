package Recursion_kunal;

public class binarySearch {
    public static void main(String[] args) {
        int []nums={1,4,5,12,23,45,67,89};
        System.out.println(binary_search(nums,0,nums.length-1,45));
    }
    public static int binary_search(int []nums,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            end=mid-1;
            mid=start+(end-start)/2;
            return binary_search(nums,start,end,target);
        }
            start=mid+1;
            mid=start+(end-start)/2;
        return binary_search(nums,start,end,target);
    }
}
