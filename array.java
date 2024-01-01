import java.util.ArrayList;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        int [] arr=new int[5];
        int []arr={1,2,3,4,5,6};
        System.out.println(binarySearch(arr,4));
//        char[]arr=new char[];
//        String []arr=new String[];
//        float []arr=new float[];
//        int [][]matrix=new int[3][4];

    }
    public static int binarySearch(int []arr,int target){
     int s=0;
     int e=arr.length-1;
     while (s<=e){
         int mid=s+(e-s)/2;
         if(arr[mid]==target){
             return mid;
         }
         else if(arr[mid]<target){
             s=mid+1;
         }
         else{
             e=mid-1;
         }
     }
      return -1;
    }
}
