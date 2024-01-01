package Tutioln;

import java.util.Scanner;

public class checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        int count=0;
        for ( int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                continue;
            }
            else{
                System.out.println("Number is included in the stringBuilder");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("There is no number included in the StringBuilder");
        }
    }
}
