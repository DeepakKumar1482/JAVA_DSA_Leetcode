import java.util.HashMap;
import java.util.Map;

public class leetcode974 {
    public static void main(String[] args) {
        int []arr={4,5,0,-2,-3,1};
//        System.out.println(-5%5);
        System.out.println(subarraysDivByK(arr,5));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
//          0 => is for reminder and 1 => is for frequency
        int sum=0;
        int rem=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
               count+=map.get(rem);
               map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
//        int count=0;
//        for (int i=0;i<nums.length;i++){
//            int sum=nums[i];
//            if(sum%k==0){
//                count++;
//            }
//            for ( int j=i+1;j<nums.length;j++){
//                    sum+=nums[j];
//                    if(sum%k==0){
//                        count++;
//                    }
//            }
//        }
//        return count;
        return count;
   }
}
