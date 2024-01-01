//Given an array A of size N of integers. Your task is to find the sum of minimum
// and maximum element in the alrray.
package Geeks_for_Geeks.java;
import java.util.Arrays;
public class min_max {
    public static void main(String[] args) {
        int arr[]={-2, 1, -4, 5, 3};
        Arrays.sort(arr);
        System.out.println(arr[0]+arr[arr.length-1]);
    }
}
