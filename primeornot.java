import java.util.Scanner;
import java.math.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = isprime(num);
        if (res)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }

  public  static boolean isprime(int n)
    {
        int i = 2,temp=0;
        if(n <= 1){
            return false;
        }

            for (i = 2; i < n; i++) {
                if (n % i == 0 && n != 2) {
                    temp = 1;

                }

            }

        if(temp==0 || n==2){
            return true;
        }
        else
        return false;
    }
}


