import java.util.Arrays;
import java.util.HashMap;

public class leetcode2433 {
    public static void main(String[] args) {
        int []arr={5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(arr)));
    }
    public static int[] findArray(int[] pref) {
        HashMap<Integer,Integer>map=new HashMap<>();
//        map.containsKey()
        int []dp=new int [pref.length];
        dp[0]=pref[0];
        int sum=0;
        if(pref.length>1){
            sum=pref[1]+pref[0];
            dp[1]=sum^pref[0];
        }
        for(int i=2;i<pref.length;i++){
            for(int j=i;j<pref.length;j++){
            }
        }
        if(pref.length>1){
            dp[1]=sum;
        }
        return dp;
    }
}
