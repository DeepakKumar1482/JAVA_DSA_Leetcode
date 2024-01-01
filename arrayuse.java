import java.util.Arrays;
import java.util.Scanner;

public class arrayuse {
    public static void main(String args[])
    {
        System.out.println("ENTER THE no of rows and colmns");
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int colmn =sc.nextInt();
        int[] []arr=new int [row][colmn];
        for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
