import java.util.*;

public class leetcode80 {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        int count=0;
        int pointer=0;
        for(int k:map.keySet()){
            if(map.get(k)>2){
                for (int i=0;i<2;i++){
                    nums[pointer]=k;
                    count+=1;
                    pointer++;
                }
            }else{
                count+=map.get(k);
                for (int i=0;i<map.get(k);i++) {
                    nums[pointer] = k;
                    pointer++;
                }
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
