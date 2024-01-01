import java.util.Scanner;

public class fabonacci_series_recrsion {
    public static void main(String args[]){
        Scanner in= new Scanner (System.in);
        int n=in.nextInt();
        int i=0;int sum=1;
        System.out.print(i+" "+sum);
        fabonacci_series(i,sum,n,1);
    }
    static void  fabonacci_series(int i,int sum,int n,int k){
        if(k==n-2){
            System.out.print(" "+(i+sum));
            return ;
        }
        else{
                int sum1 =i+sum;
            System.out.print(" "+sum1);
            i=sum;
           sum=sum1;
            k++;
            fabonacci_series(i,sum,n,k);
        }
    }
}
