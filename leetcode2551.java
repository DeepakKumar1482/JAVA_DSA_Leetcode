import java.util.Arrays;

public class leetcode2551 {
    public static void main(String args[]){
        int []arr={1,3,5,1};
        putMarbles(arr,2);
    }
    public static long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int []pairs=new int[n-1];
        for(int i=1;i<n;i++){
            pairs[i-1]=weights[i]+weights[i-1];
        }
        Arrays.sort(pairs);
        long min=0;
        long max=0;
        for(int i=0;i<k-1;i++){
             min+=pairs[i];
            max+=pairs[n-i-2];
        }
        return max-min;
    }
}
