import java.util.ArrayList;
import java.util.Arrays;

public class leetcode2391 {
    public static void main(String[] args) {
        String []arr={"G","P","GP","GG"};
        int []num={2,4,3};
        System.out.println(garbageCollection(arr,num));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int page=0;
        int metal=0;
        int glass=0;
        int k=0;
        int p=0;
        int g=0;
        int m=0;
        int []dp=new int[travel.length];
        int sum=0;
        for(int i=0;i<travel.length;i++){
            sum+=travel[i];
            dp[i]=sum;
        }
        System.out.println(Arrays.toString(dp));
        for(int i=0;i<garbage.length;i++){
            if(i!=0){
                if(garbage[i].contains("P")){
                    p=dp[i-1];
                }if((garbage[i].contains("M"))){
                    m=dp[i-1];
                }if((garbage[i].contains("G"))){
                    g=dp[i-1];
                }
                k++;
            }
            for(int j=0;j<garbage[i].length();j++){
                char curr=garbage[i].charAt(j);
                if(curr=='P'){
                    page+=1;
                }else if(curr=='M'){
                    metal+=1;
                }else{
                    glass+=1;
                }
            }
        }
        return page+metal+glass+m+g+p;
    }
}
