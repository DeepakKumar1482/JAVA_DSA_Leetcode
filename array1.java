import java.util.*;
public class array1 {
    public static void main(String args[])
    {
        System.out.println("ENTER THE SIZE");
        Scanner sc=new Scanner(System.in);
       int size =sc.nextInt();
       int []arr=new int [size];
       for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
       }
       for(int i=0;i<size;i++){
           System.out.println(arr[i]);
       }

    }
}
