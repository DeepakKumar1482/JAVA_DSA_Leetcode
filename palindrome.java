import java.util.Scanner;

public class palindrome {
    public static void main(String arg[]){
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0;
        int temp=num;
        int sum=0;
        for(int i=0;num>0;i++){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("This is a Palindrome number");
        }
        else{
            System.out.println("This is not a Palindrome number");
        }
    }
}
