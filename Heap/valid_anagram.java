package Heap;

import java.util.HashMap;

public class valid_anagram {
    public static void main(String[] args) {
        String s="race";
        String t="care";
        System.out.println(isanagram(s,t));
    }
    public static boolean  isanagram(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map.get(c)==1){
                map.remove(c);
            }
            else{
                map.put(c,map.get(c)-1);
            }
        }
        return map.isEmpty();
    }
}
