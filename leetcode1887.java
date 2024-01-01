import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class leetcode1887 {
    public static void main(String[] args) {
        int []arr={1,1,2,2,3};
        System.out.println(reductionOperations(arr));
    }
    public static int reductionOperations(int[] nums) {
//        Arrays.sort(nums);
        int ans=0;
        TreeMap<Integer,Integer> map=new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int i=map.size();
        for (int num:map.keySet()) {
            if(map.get(num)>1){
                ans=ans+(i-1)*map.get(num);
            }else{
                ans+=i-1;
            }
            i--;
        }
        System.out.println(map);
        return ans;
    }
}
