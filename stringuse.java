import java.util.*;
public class stringuse {
 public static void main(String args[]){
     {
         Scanner in =new Scanner(System.in);
         int N=in.nextInt();
         int []A=new int[N];
         for(int i=0;i<N;i++)
         {
             A[i]=in.nextInt();
         }
         int min=A[0];
         int max=A[0];
         for(int j=0;j<N;j++){

             if(A[j]<min) {
                 min = A[j];
             }
             if(A[j]>max){
                 max=A[j];
             }

         }
         System.out.println(min);
         System.out.println(max);

     }
 }
}
