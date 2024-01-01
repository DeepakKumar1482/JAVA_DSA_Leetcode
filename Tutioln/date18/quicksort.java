package Tutioln.date18;

import java.util.Arrays;
// IN QUICK SORT WE TAKE A PIVOT WHICH THE LAST ELEMENT OF THE ARRAY AND WE PLACE IT ON IT'S RIGHT
// POSITION MEANS THE ELEMENT WHICH ARE SMALLER THAN IT ARE BEFORE PIVOT IN ARRAY AND THOSE WHICH ARE
// GREATER THAN IT COME LATER THAN THE PIVOT IN THE ARRAY AFTER THAT WE DIVIDE THE ARRAY IN TWO PARTS
// LEFT AND RIGHT AND TAKE THE PIVOT AS LAST ELEMENT IN LEFT ARRAY AND RIGHT ARRAY AND MAKE THE RECURSIVE
// CALLS FOR LEFT ARRAY AND RIGHT ARRAY
public class quicksort {
    public static void main(String[] args) {
        int []arr={4,1,7,4,2,9,0,12,3};
        int n=arr.length;
        quicksort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void  quicksort(int arr[],int low ,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
//THIS PARTITION FUNCTION RETURNS THE INDEX OF THE PIVOT AND THEN AGAIN WE CALL QUICKSORT FUNCTION ACCORDINGLY
    public static int partition(int arr[], int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;// PIVOT INDEX
    }
}
