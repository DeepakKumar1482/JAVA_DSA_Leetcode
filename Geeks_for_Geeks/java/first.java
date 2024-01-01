//You are given a string s. You need to reverse the string.
package Geeks_for_Geeks.java;
public class first {
    public static void main(String[] args) {
        String str="Gees";
        String ans=reverse(str);
        System.out.println(ans);
    }
    static String reverse(String str){
        String st="";
        for(int i=str.length()-1;i>=0;i--){
           st+= str.charAt(i);
        }
        return st;
    }
}
