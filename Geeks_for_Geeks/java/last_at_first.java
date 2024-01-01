package Geeks_for_Geeks.java;

import java.util.Arrays;
import java.util.Collections;

public class last_at_first {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ar[]=new int[arr.length];
        ar[0]=arr[arr.length-1];
        for(int i=0;i<ar.length-1;i++){
            ar[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(ar));
    }

}
