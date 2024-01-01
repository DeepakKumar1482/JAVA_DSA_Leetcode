import java.util.HashMap;
import java.util.TreeMap;

public class leetcode387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s){
    HashMap<Character,Integer> map=new HashMap<>();
   for (int i=0;i<s.length();i++){
       if(map.containsKey(s.charAt(i))){
           map.put(s.charAt(i),-1);
       }else{
           map.put(s.charAt(i),i);
       }
   }
   int min=Integer.MAX_VALUE;
   for (int idx:map.values()){
       if(idx!=-1 && idx<min){
           min=idx;
       }
   }
   return min>-1?min:-1;
}
}
