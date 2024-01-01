package Tutioln;
import  java.util.*;
//str1 and str2
public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str1=new StringBuilder(sc.nextLine());
        StringBuilder str2=new StringBuilder(sc.nextLine());
        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    System.out.print(str1.charAt(i));
                }
            }
        }
    }
}
