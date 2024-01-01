import java.util.Arrays;
import java.util.HashMap;

public class leetcode389 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();

        String s="abcd";
        String t="abcde";
        boolean []c=new boolean[26];
        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            c[idx]=true;
            if(c[idx]){
                freq[idx]=freq[idx]+1;
            }
        }
        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            freq[idx]=freq[idx]-1;
        }
        System.out.println(Arrays.toString(freq));
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println( (char)(i+97));
                break;
            }
        }
//        return 'a';
    }
}
