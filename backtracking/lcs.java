package backtracking;

import java.util.ArrayList;

public class lcs {
    static ArrayList<String>list1=new ArrayList<>();
    static ArrayList<String>list2=new ArrayList<>();
    public static void main(String[] args) {
        subsequence("abcde",new StringBuilder(""),list1,0);
        subsequence("ace",new StringBuilder(""),list2,0);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void subsequence(String s,StringBuilder str,ArrayList<String>list,int start){
        for(int i=start;i<s.length();i++){
            str.append(s.charAt(i));
            list.add(str.toString());
            subsequence(s,str,list,i+1);
            str.deleteCharAt(str.length()-1);
        }
    }
}
