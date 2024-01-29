package Recursion_kunal;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={4,1,5,2,7,3};
        bubble_sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble_sort(int []arr,int last,int start){
        if(last==0){
            return;
        }
        if(start<last){
            if(arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            bubble_sort(arr,last,++start);
        }else{
            bubble_sort(arr,--last,0);
        }
    }
}
