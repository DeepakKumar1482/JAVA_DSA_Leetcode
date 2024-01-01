package backtracking;

import java.util.HashMap;

public class k_subsets {
    static HashMap<Integer,Integer>map=new HashMap<>();
    public static void main(String[] args) {
        int []nums={4,3,2,3,5,2,1};
        canPartitionKSubsets(nums,4,0,0);
        System.out.println(map);

        
    }
    public static void canPartitionKSubsets(int[] nums, int k,int sum,int idx) {
        if(idx==nums.length){
            return;
        }
        for(int i=idx;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
            System.out.print(sum+" ");
            canPartitionKSubsets(nums,k,sum,i+1);
            sum=sum-nums[i];
        }
    }
}
