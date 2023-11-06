package backtracking;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int arr[]=new int[5];
        printarr(arr,0,2);
        print(arr);
    }
    public static void printarr(int arr[],int ind,int val){
        int a=0;
        if(ind==arr.length){
            print(arr);
            return;
        }
        System.out.println("Hyy bro");
        arr[ind]=val;
        printarr(arr,ind+1,val+1);
        arr[ind]=arr[ind]-2;
    }
    public static void print(int arr[]){
//        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }
}
