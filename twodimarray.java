import java.util.Arrays;
import java.util.Scanner;

public class twodimarray {
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int colm=in.nextInt();
        int [][]arr=new int[row][colm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int k=0;k<row;k++){

            System.out.println(Arrays.toString(arr[k]));
        }
    }
}



