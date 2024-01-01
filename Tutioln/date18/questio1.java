package Tutioln.date18;

import java.util.Arrays;
import java.util.Comparator;

public class questio1 {
    public static void main(String[] args) {
//        {1,2,3,4,5,7,8,9}
        int []arr={3,4,5,7,8,9};
        int ans=Finder(arr);
        System.out.println(ans);
    }
    public static int Finder(int arr[]){

        System.out.println();
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int actualsum=0;
        int j=arr[0];
        for (int i=0;i<=arr.length;i++){
            actualsum+=j;
            j++;
        }
        return actualsum-sum;
    }
}
