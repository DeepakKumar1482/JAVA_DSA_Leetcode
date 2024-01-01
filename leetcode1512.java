import java.util.HashMap;

public class leetcode1512 {
    public static void main(String[] args) {
        int []arr={1,1,1,1};
        numIdenticalPairs(arr);
    }
    public static int numIdenticalPairs(int[] nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int count=0;
        for (int freq:map.values()){
            for (int i=1;i<freq;i++){
                count=count+freq-i;
            }
        }
        System.out.println(map);
        System.out.println(count);
        return count;
    }
}
