import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode1647 {
    public static void main(String[] args) {
        System.out.println(minDeletions("aaabbbcc"));
    }
    public static int minDeletions(String s) {
       int []freq=new int[26];
       for (char c:s.toCharArray()){
           freq[c-'a']++;
       }
        Set<Integer>set=new HashSet<>();
       int deletion=0;
       for (int count:freq){
           if(count!=0 && !set.add(count)){
               deletion++;
               count--;
           }
           set.add(count);
       }
       return deletion;
    }
}
