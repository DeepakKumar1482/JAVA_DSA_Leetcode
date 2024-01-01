import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode5 {
    public static void main(String[] args) {
        String s="aacabdkacaa";
        longestPalindrome(s);
    }
    public static String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int odd=helper(s,i,i);
            int even=helper(s,i,i+1);
            int len=Math.max(odd,even);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int helper(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
