import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class newmax {
    public static void main(String[] args) {
       String str="mississippi";
       String tar="issipi";
        System.out.println(strStr(str,tar));
    }
    public static int strStr(String haystack, String needle) {
        int j=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                int temp=i;
                int c=0;
                int count=0;
                for(int k=0;k<needle.length();k++){
                    if(haystack.charAt(temp)==needle.charAt(k)){
                        count++;
                        if(temp<haystack.length()-1) {
                            temp++;
                        }
                    }
                    else{
                        break;
                    }
                }
                if(count==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
