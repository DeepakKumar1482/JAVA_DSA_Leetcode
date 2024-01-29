import java.util.Arrays;

public class leetcode1657 {
    public static void main(String[] args) {
        System.out.println(closeStrings("cabbbae","abbcccd"));
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Character []arr1=new Character[26];
        for(int i=0;i<word1.length();i++){
            arr1[word1.charAt(i)-'a']=word1.charAt(i);
        }
        for(int i=0;i<word2.length();i++){
            if(arr1[word2.charAt(i)-'a']==null){
                return false;
            }
        }
        for (int i=0;i<word2.length();i++){
            if(arr1[word2.charAt(i)-'a']==word2.charAt(i)){
                arr1[word2.charAt(i)-'a']='A';
            }
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=null && arr1[i]!='A'){
                return false;
            }
        }
        System.out.print(Arrays.toString(arr1));
        return true;
    }
}
