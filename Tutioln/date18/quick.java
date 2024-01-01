package Tutioln.date18;

import java.util.Arrays;
//selection sort
public class quick {
    public static void main(String[] args) {
        int []arr={3,4,1,7,5,2,9};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
