import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class leetcode2549 {
    public static void main(String[] args) {
//        System.out.println(distinctIntegers(5));
        int arr[]={-65,-65,50,-65,50,-55,-65,-65};
        System.out.println(distinctIntegers(arr));
    }
    public static int distinctIntegers(int nums[]) {
        HashSet<Integer>set=new HashSet<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
//        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        int l=0;
        int count=0;
        for (int a:map.values()){
           if(l>0 && l<map.size()-1){
               count=count+a;
           }
           l++;
        }
        return count;
    }
}
