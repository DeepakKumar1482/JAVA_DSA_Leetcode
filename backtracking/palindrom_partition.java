package backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindrom_partition {
    public static void main(String[] args) {
        List<List<String >>list=new ArrayList<>();
        List<String >l=new ArrayList<>();
        helper("aab",list,l);
        System.out.println(list);
    }
    public static void helper(String s,List<List<String>>list,List<String>l){
        if(s.length()==0){
            list.add(l);
            return;
        }
        for (int i=0;i<s.length();i++){
            String prefix=s.substring(0,i+1);
            String ros=s.substring(i+1);
            if(ispalindrome(prefix)){
                l.add(prefix);
                helper(ros,list,l);
            }
        }
    }
    public static boolean ispalindrome(String s){
        int st=0;
        int e=s.length()-1;
        while (st<=e){
          if(s.charAt(st)!=s.charAt(e)){
              return false;
          }
          st++;
          e--;
        }
        return true;
    }
}
