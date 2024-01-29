package Recursion_kunal.Backtracking;

public class removeA {
    public static void main(String[] args) {
        System.out.println(Remover("abbada",0));
    }
    public static String Remover(String str,int idx){
        String s="";
        if(str.charAt(idx)!='a') {
            s += str.charAt(idx);
        }
        if(idx==str.length()-1){
            return s;
        }
        return s+Remover(str,++idx);
    }
}
