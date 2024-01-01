import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leetcode1048 {
    public static void main(String[] args) {
        String[] str={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        HashSet<String>set=new HashSet<>();
        longestStrChain(str);
    }
    public static int longestStrChain(String[] words){
        for (int i=0;i<words.length-1;i++){
            for (int j=i+1;j<words.length;j++){
               if(words[i].length()>words[j].length()){
                   String temp=words[i];
                   words[i]=words[j];
                   words[j]=temp;
               }
            }
        }
        System.out.print(Arrays.toString(words));
        int [][]dp=new int[words.length][words[words.length-1].length()];

        return 1;
    }
}
