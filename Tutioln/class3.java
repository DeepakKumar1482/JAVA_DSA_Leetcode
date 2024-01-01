package Tutioln;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int cout=1;
        for (int i=1;cout<=num;i++){
            if(i%2==0){
                System.out.println(i+" is an Even number");
                cout++;
            }
            else{
                System.out.println(i+" is an Odd number");
            }
        }
    }
}
