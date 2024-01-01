import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class spiralmatrix {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
            
//        Scanner sc=new Scanner(System.in);
//        int rows=sc.nextInt();
//        int col=sc.nextInt();
//        int arr[][]=new int[rows][col];
//        for (int i=0;i<rows;i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i=0;i<rows;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int srow=0;
        int scol=0;
        int erow=arr.length-1;
        int ecol=arr[0].length-1;
        while (srow<=erow && scol<=ecol){
            for (int j=scol;j<=ecol;j++){
                System.out.print(arr[srow][j]+" ");
            }
            for (int i=srow+1;i<=erow;i++){
                System.out.print(arr[i][ecol]+" ");
            }
            for (int j=ecol-1;j>=scol;j--){
                System.out.print(arr[erow][j]+" ");
            }
            for (int i=erow-1;i>=srow+1;i--){
                System.out.print(arr[i][scol]+" ");
            }
            srow++;
            scol++;
            ecol--;
            erow--;
        }
        System.out.println();
    }
}
