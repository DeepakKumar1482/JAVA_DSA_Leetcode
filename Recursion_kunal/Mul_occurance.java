package Recursion_kunal;

import java.util.ArrayList;
import java.util.List;

public class Mul_occurance {
    public static void main(String[] args) {
        int []nums={8,3,4,2,3,7};
        System.out.println(helper(nums,3,0));
    }
    public static List<Integer> helper(int []nums,int target,int idx){
        List<Integer>list=new ArrayList<>();
        if(idx==nums.length){
            return list;
        }
        if(nums[idx]==target){
            list.add(idx);
        }
        List<Integer>ansfrombelowcalls=helper(nums,target,++idx);
        list.addAll(ansfrombelowcalls);
        return  list;
    }
}
