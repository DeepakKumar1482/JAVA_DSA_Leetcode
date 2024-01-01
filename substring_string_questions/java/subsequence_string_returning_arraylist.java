package substring_string_questions.java;

import java.util.ArrayList;

public class subsequence_string_returning_arraylist {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String>list=new ArrayList<>();
        substr(str,"",list);
        System.out.println(list);
    }
    static ArrayList<String> substr(String p,String up,ArrayList<String>list){
        if(p.isEmpty()){
            list.add(up);
            return list;
        }
        char ch=p.charAt(0);
        substr(p.substring(1),up+ch,list);
        substr(p.substring(1),up,list);
        return list ;
    }
}
