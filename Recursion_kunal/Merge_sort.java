package Recursion_kunal;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1,6,2,8,4,6};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    public static int[] mergesort(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int []left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int []right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int []left,int[]right){
        int i=0;
        int j=0;
        int k=0;
        int []merged=new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]>right[j]){
                merged[k]=right[j];
                j++;
            }else{
                merged[k]=left[i];
                i++;
            }
            k++;
        }
        while (i<left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        return merged;
    }
//    19->     10011

}
