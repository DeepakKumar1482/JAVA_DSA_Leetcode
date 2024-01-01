//You have given a sum and you have to find the subarray with given sum.
package subarray;

import com.sun.source.tree.BinaryTree;

import java.util.HashMap;

public class given_sum {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int sum=11;
        finder(nums,sum);
    }
    public static void finder(int nums[],int sum){
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>ans=new HashMap<>();
        int start=0;
        int end=-1;
        int currsum=0;
        for (int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum-sum==0){
                start=0;
                end =i;
//                break;
                ans.put(start,end);
            }
            if(map.containsKey(currsum-sum)){
                start=map.get(currsum-sum);
                end=i;
                ans.put(start,end);
            }
            map.put(currsum,i);
        }
        int min=Integer.MAX_VALUE;
        for(int a:ans.keySet()){
            int index=ans.get(a)-a;
            if(index<min){
                min=index;
            }
        }
        System.out.println(min);
        System.out.println(map);
        System.out.println(ans);
    }
}
