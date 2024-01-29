package Recursion_kunal.Backtracking;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets("abc",""));
    }
    public static List<String> subsets(String str,String up){
        if(str.isEmpty()){
            List<String>list=new ArrayList<>();
            list.add(up);
            return list;
        }
        char c=str.charAt(0);
        List<String>left=subsets(str.substring(1),up+c);
        List<String>right=subsets(str.substring(1),up);
        left.addAll(right);
        return left;
    }
}