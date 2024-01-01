import java.util.Arrays;
import java.util.Scanner;

public class arraystring1 {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int colmn=in.nextInt();
    int [] []arr=new int[row][colmn];
    for(int i=0;i<5;i++){
        for(int j=0;j<6;j++){
            arr[i][j]=in.nextInt();
        }
    }
    for(int[]a:arr){
        System.out.println(Arrays.toString(a));;
    }
}
}
