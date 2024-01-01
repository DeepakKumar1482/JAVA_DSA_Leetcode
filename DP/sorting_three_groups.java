package DP;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class sorting_three_groups {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3);
        System.out.println(minimumOperations(list));
    }
//    Input: nums = [1,3,2,1,3,3]
    public static int minimumOperations(List<Integer> nums){
        int l=nums.size();
        int []dp={l,l,l,l};
        for(int num:nums){
            dp[num]--;
            dp[2]=Math.min(dp[2],dp[1]);
            dp[3]=Math.min(dp[3],dp[2]);
        }
        return dp[3];
    }
}
