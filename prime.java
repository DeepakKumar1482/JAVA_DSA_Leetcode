import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean ans=prime_or_not(num);
        if(ans){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
    static boolean prime_or_not(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
           }
        return true;
    }
}
