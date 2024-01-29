import java.util.*;

public class leetcode2610 {
    public static void main(String[] args) {
        int []arr={1,3,4,1,2,3,1};
        findMatrix(arr);
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int maxfreq=0;
        for (int freq:map.values()){
            maxfreq=Math.max(freq,maxfreq);
        }
        for (int i=0;i<maxfreq;i++){
            List<Integer> l=new ArrayList<>();
            Set<Integer>set=new HashSet<>();
            for (int j=0;j<nums.length;j++){
                if(nums[j]!=Integer.MIN_VALUE) {
                    if (set.add(nums[j])) {
                        l.add(nums[j]);
                        nums[j] = Integer.MIN_VALUE;
                    }
                }
            }
            list.add(l);
        }
//        int i=0;
//        for (int val:map.keySet()){
//            List<Integer>l=new ArrayList<>();
//            for (int j=0;j<map.size();j++){
//
//            }
//        }
        return list;
    }
}
