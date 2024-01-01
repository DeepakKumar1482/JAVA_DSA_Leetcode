import java.util.HashMap;

public class leetcode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("length = "+lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer>hmap=new HashMap<>();
        int n=s.length();
        int i=0;
        int len=0;
        int count=0;
        int temp=1;
        while (i<n){
            if(hmap.containsKey(s.charAt(i) ) ){
                if(len<count) {
                    len = count;
                    System.out.println("count"+count);
                    System.out.println(hmap);
                }
                count=0;
                hmap.clear();
            }
                hmap.put(s.charAt(i), i);
                count=count+1;
                i++;
                temp++;
        }
        if( hmap.size()>len){
            return hmap.size();
        }
        System.out.println(i);
        return len;
    }
}
