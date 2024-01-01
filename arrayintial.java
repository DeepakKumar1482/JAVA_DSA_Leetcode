import java.util.Scanner;

public class arrayintial {
    public static void main(String args[]){
//        System.out.println(9%10);;
        int []arr;
        Scanner in=new Scanner(System.in);
        arr=new int[6];
        for(int i=0;i<6;i++){
           arr[i] =in.nextInt();
        }
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
    }
}
