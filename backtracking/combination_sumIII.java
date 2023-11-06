package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sumIII {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>list=new ArrayList();
        List<Integer>l=new ArrayList();
        helper(k,n,0,list,l,1) ;
        System.out.println(list);
        return list;
    }
    public static void helper(int k,int target,int sum,List<List<Integer>>list,List<Integer>l,int idx){
        if(l.size()==k){
            if(sum==target){
                list.add(new ArrayList<>(l));
                return;
            }
            return;
        }
        while(idx<=9){
            l.add(idx);
            sum=sum+idx;
            idx++;
            helper(k,target,sum,list,l,idx);
            sum=sum-l.get(l.size()-1);
            l.remove(l.size()-1);
        }
    }
}

