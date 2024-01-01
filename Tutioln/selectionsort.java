package Tutioln;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int []arr={5,2,3,8,1,12,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
