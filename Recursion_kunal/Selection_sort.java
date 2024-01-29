package Recursion_kunal;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int []arr={4,3,7,1,9,2,7,4,5,6,8,2};
        SelectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int []arr,int last,int start,int idx){
        if(last==0){
            return;
        }
        if(start<=last){
            if(arr[start]>arr[idx]){
                idx=start;
                SelectionSort(arr,last,++start,idx);
            }else{
                SelectionSort(arr,last,++start,idx);
            }
        }else{
            int temp=arr[last];
            arr[last]=arr[idx];
            arr[idx]=temp;
            SelectionSort(arr,--last,0,0);
        }
    }
}
