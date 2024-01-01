package Tutioln;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        System.out.println(Arrays.toString(TwoSum(arr, 30)));
    }
    public static int[] TwoSum(int []arr,int target){
        int []ans=new int[2];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length-1;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
