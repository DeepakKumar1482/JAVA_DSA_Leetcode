import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.*;
public class leetcode989 {
    public static void main(String[] args) {
//        List<String>list=new ArrayList<>();
        String num="1432219";
        int k=3;
        System.out.println(removeKdigits(num,k));
//        Arrays.sort();
//        int a= Integer.MIN_VALUE
    }
    public static String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int remaining = num.length() - k;
        for (char c : num.toCharArray()) {
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }
        while (sb.length() > remaining) {
            sb.deleteCharAt(sb.length() - 1);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}