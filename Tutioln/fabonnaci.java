package Tutioln;

import java.util.Scanner;

public class fabonnaci {
    public static void main(String[] args) {
//        int range=10;
//        int a=1;
//        int b=0;
//        int f=0;
//        int i=0;
//        while (i<10){
//            System.out.println(f);
//            f=a+b;
//            a=b;
//            b=f;
//            i++;
//        }
       int a=1;
       int b=0;
       int f=0;
       int i=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
       while (i<=num){
           if(f==num){
               System.out.println("Number present in fabonacci series");
               count++;
               break;
           }
//           System.out.println(f);
           f=a+b;
           a=b;
           b=f;
           i++;
        }
       if(count==0){
           System.out.println("Number does not present in Fabonacci series");
       }
    }
}
