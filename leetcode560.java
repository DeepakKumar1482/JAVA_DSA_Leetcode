import java.util.HashMap;
import java.util.logging.Handler;

public class leetcode560 {
    public static void main(String[] args) {
        int []arr={1,-1,0};
        System.out.println(subarraySum(arr,0));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
//            map.put(sum,map.getOrDefault(sum,0)+1);
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}
