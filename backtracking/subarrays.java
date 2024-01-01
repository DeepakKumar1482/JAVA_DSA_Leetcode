//you have given a string and you have to find all possible substrings preset and have to print them.
package backtracking;

import java.util.*;

public class subarrays {
    static ArrayList<String>list=new ArrayList();
    public static void main(String args[]){
        String s="cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde";
        HashMap<String,Integer>map=new HashMap();
        for(int i=0;i<s.length();i++){
            String str="";
            // str+=s.charAt(i);
            // list.add(str);
            for(int j=i;j<s.length();j++){
                str+=s.charAt(j);
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }else{
                    map.put(str,1);
                    HashSet<Character>set=new HashSet<>();
//                    set.add();

                }
            }
        }
        System.out.println(map);
//        String ans="";
//        int ind=0;
//        helper(str,ind,new StringBuilder(""));
//        for (String s:list){
//            System.out.println(s);
//        }
////        HashMap<Integer,Integer>map=new HashMap<>();
////        map.keySet();
//    }
//    public static void helper(String s,int idx,StringBuilder curr){
//        for(int i=0;i<s.length();i++){
//            String str="";
//            str+=s.charAt(i);
//            list.add(str);
//            for(int j=i+1;j<s.length();j++){
//                str+=s.charAt(j);
//                list.add(str);
//            }
//        }
    }
}





