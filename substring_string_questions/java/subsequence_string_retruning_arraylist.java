package substring_string_questions.java;

import java.util.ArrayList;

public class subsequence_string_retruning_arraylist {
    public static void main(String[] args) {
        String processed="abc";
        ArrayList<String>list=new ArrayList<>();
       list= substr(processed,"");
        System.out.println(list);
    }
    static ArrayList<String> substr(String p,String up){
        if(p.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(up);
            return list;
        }
        char ch=p.charAt(0);
        ArrayList<String>left=substr(p.substring(1),up+ch);
        ArrayList<String>right=substr(p.substring(1),up);
        left.addAll(right) ;
        return left;
    }
}
