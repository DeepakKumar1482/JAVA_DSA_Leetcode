package permutation.java;

import java.util.ArrayList;
import java.util.List;

public class retruring_arraylist_permutaion {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String>list=new ArrayList<>();
        permut("",str,list);
        System.out.println(list);
    }
    static ArrayList<String> permut(String p, String up, ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String left=p.substring(0,i);
            String right=p.substring(i,p.length());
            permut(left+ch+right,up.substring(1),list);
        }
        return list;
    }
}
