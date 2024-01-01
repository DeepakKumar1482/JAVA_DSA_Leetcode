package Tutioln;

import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2=sc.nextLine();
//        String ans="";
//        for ( int i=0;i<str1.length();i++){
//            int count=0;
//            for ( int j=0;j<str2.length();j++){
//                if(str1.charAt(i)==str2.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==0){
//                ans+=str1.charAt(i);
//            }
//        }
//        System.out.println(ans);
        System.out.println("ENTER ANY LETTER");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String s =obj.nextLine();
        String a="";
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                if (str.charAt(i)==s.charAt(j))
                {
                    count++;
// if(!a.contains(Character.toString(str.charAt(i))))
                }
            }
            if(count==0) {
                a+=str.charAt(i);
            }
        }
        System.out.println(a);
    }
}
