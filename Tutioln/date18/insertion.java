package Tutioln.date18;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int []arr={4,2,3,1,2,8,4,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(inser(arr,8));
    }
    public static int inser(int arr[],int target){
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else {
                return mid;
            }
        }
//        for (int i=0;i<arr.length;i++){
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0 && key<arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
        return 0;
    }
}
