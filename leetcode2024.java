import java.util.*;

public class leetcode2024 {
    public static void main(String[] args) {
        String str="TTFTTFTT";
        System.out.println(maxConsecutiveAnswers(str,1));
    }
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int ans=0;
        int l=0;
        int i=0;
        int count=0;
        while (i<answerKey.length()){
            if(answerKey.charAt(i)=='T'){
                count++;
            }
            while (count>k){
                if(answerKey.charAt(l)=='T'){
                    count--;
                }
                l++;
            }
            ans= Math.max(ans,i-l+1);
            i++;
        }
        count=0;
        l=0;
        i=0;
        while (i<answerKey.length()){
            if(answerKey.charAt(i)=='F'){
                count++;
            }
            while (count>k){
                if(answerKey.charAt(l)=='F'){
                    count--;
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
            i++;
        }
        return ans;
    }
}
