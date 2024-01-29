package Recursion_kunal;

import java.util.ArrayList;
import java.util.List;

public class dial_Pad {
    public static void main(String[] args) {
        System.out.println(DialPad("","12"));
    }
    public static List<String> DialPad(String p,String up){
        if (up.isEmpty()){
            List<String>list=new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        List<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
           ans.addAll(DialPad(p+ch,up.substring(1)));
        }
        return ans;
    }
}











