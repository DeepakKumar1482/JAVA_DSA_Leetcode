package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,8,9,10,12,23,32,43,45,65,67};
        System.out.println(search(arr,8,0,arr.length-1));
    }
    public static int search(int []arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
