package Tutioln;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int condition=(int) Math.sqrt(num);
        for (int i=2;i<=condition;i++){
            if(num%i==0){
                System.out.println("Number is not prime");
                count++;
                break;
            }
        }
        if(count==0 || num==2){
            System.out.println("Number is prime");
        }
    }
}
