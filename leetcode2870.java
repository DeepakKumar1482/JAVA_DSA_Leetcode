import java.util.Arrays;
import java.util.HashMap;

public class leetcode2870 {
    public static void main(String[] args) {
//        int []nums={14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
//        int []nums={2,3,3,2,2,4,2,3,4};
        int []nums={19,19,19,19,19,19,19,19,19,19,19,19,19};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int min_operations=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (int freq:map.values()){
            if(freq==1){
                return -1;
            }
            else {
                if (freq % 3 == 0) {
                    min_operations += freq / 3;
                } else {
                    while (freq != 0) {
                        if (freq == 2) {
                            min_operations += 1;
                            freq = 0;
                        }
                        if (freq - 3 > 0) {
                            freq = freq - 3;
                            min_operations += 1;
                        }
                        if (freq == 1) {
                            freq += 3;
                            min_operations -= 1;
                            min_operations += freq / 2;
                            freq = 0;
                        }
                    }
                }
//                 else {
//                    while (freq != 0) {
//                        freq = freq - 3;
//                        min_operations += 1;
//                        if(freq%2==0){
//                            min_operations+=freq/2;
//                            freq=freq/2;
//                            freq=0;
//                        }
//                    }
//                }
            }
        }
        System.out.println(map);
        return min_operations;
    }
}
