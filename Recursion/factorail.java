package Recursion;

import java.util.Scanner;

public class factorail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        n=n*fact(n-1);
        return n;
    }
}
