package Tutioln.date18;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]!=Integer.MAX_VALUE) {
                    System.out.println(Arrays.toString(checker(arr,arr[i][j])));
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
//        int n=arr.length-1;
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i][i]);
//            System.out.println(arr[i][n-i]);
//        }
    }
    public static int[] checker(int [][]arr,int target){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    count++;
                    arr[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        return new int[]{target,count};
    }
}
