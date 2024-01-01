import java.lang.reflect.Array;
import java.util.Arrays;

public class class12 {
    public static void main(String[] args) {
        int arr[]={10,8,9,12,13,1,15};
        System.out.println(Arrays.toString(helper(arr)));
    }
    public static int[] helper(int []arr){
        int dp[]=new int[arr.length];
        dp[0]=1;
        for (int i=1;i<dp.length;i++){
            int count=1;
            for (int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    count++;
                }
                else {
                    break;
                }
            }
            dp[i]=count;
        }
        return dp;
    }
}
