package Recursion_kunal.Backtracking;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class permutations {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,2,};
        Stack<Integer>stack=new Stack<>();
        targetSum(arr,9,0,0,new ArrayList<>());
    }
    public static void targetSum(int []arr,int target,int idx,int sum,List<Integer>list){
        if(sum==target){
            System.out.println(list);
            return;
        }
        for (int i=idx;i<arr.length;i++){
            if(sum+arr[i]<=target){
                list.add(arr[i]);
                targetSum(arr,target,idx+1,sum+arr[i],list);
                list.remove(list.size()-1);
            }
        }
    }
}
