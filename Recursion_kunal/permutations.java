package Recursion_kunal;

import java.util.*;

public class permutations {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Permutations("abc",list,"");
//        System.out.println(Permutations_list("abc",""));
//                System.out.println(list);
        Random rand=new Random();
        int randomIndex= rand.nextInt(5);
        System.out.println(randomIndex);
        list.set(0,"Ab");
        System.out.println(list);
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(10,1);
        System.out.println(map);
        map.remove(10);
        System.out.println(map);
    }
    public static void  Permutations(String up, List<String>list, String p){
        if (up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            Permutations(up.substring(1),list,f+ch+s);
        }
    }
    public static List<String> Permutations_list(String up,String p){
        if(up.isEmpty()){
            List<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        List<String>ans=new ArrayList<>();
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           ans.addAll(Permutations_list(up.substring(1),f+ch+s));
        }
        return ans;
    }
}
