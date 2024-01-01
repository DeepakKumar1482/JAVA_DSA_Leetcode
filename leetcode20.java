import java.util.Stack;

public class leetcode20 {
    public static void main(String[] args) {
        String str="[]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        String str1="()";
        String str2="{}";
        String str3="[]";
        if(s==str1){
            return true;
        }
        if(s==str2)
        {
            return true;
        }
        if(s==str3)
        {
            return true;
        }
            return false;
    }
}
