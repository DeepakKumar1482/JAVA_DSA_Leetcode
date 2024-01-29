package Recursion_kunal;

public class rotatedArray {
    public static void main(String[] args) {
        int []arr={5,6,7,8,1,2,3};
        System.out.println(helper(arr,2,0,arr.length-1));
    }
    public static int helper(int []arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>=arr[start]){
            if(target>=arr[start] && target<arr[mid]){
                end=mid-1;
                return helper(arr,target,start,end);
            }else{
                start=mid+1;
                return helper(arr,target,start,end);
            }
        }else{
//            if(arr[mid]<=arr[end]){
                if(target>=arr[mid] &&target<arr[end]){
                    start=mid+1;
                    return helper(arr,target,start,end);
                }else{
                    end=mid-1;
                   return helper(arr,target,start,end);
                }
        }
    }
}
