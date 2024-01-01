import java.util.Arrays;

public class leetcode338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
    public static int[] countBits(int n) {
        int [] ans=new int[n+1];
        ans[0]=0;
        ans[1]=1;
        ans[2]=1;
        for(int i=3;i<=n;i++){
           if(i%2!=0){
               ans[i]=ans[i/2]+1;
           }
           else{
               ans[i]=ans[i/2];
           }
        }
        return ans;
    }
}