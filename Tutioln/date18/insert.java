package Tutioln.date18;

import java.util.Arrays;
//Insertion sort
public class insert {
    public static void main(String[] args) {
        int []arr={3,1,2,7,5,3};
        Arrays.sort(arr);//0(nlogn)
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int arr[]){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
}
