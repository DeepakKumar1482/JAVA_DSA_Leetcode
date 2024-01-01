import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class leetcode229 {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        majorityElement(nums);
    }
    public static void majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(nums[0],1);
        for (int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int n=map.get(nums[i]);
                map.put(nums[i],n+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        int max=nums.length/3;
//        int num=0;
        for (int a: map.keySet()){
            if(map.get(a)>max){
               list.add(a);
//                num=a;
            }

        }
//        list.add(num);
//        for (int a: map.keySet()) {
//            if(map.containsValue(max) && max==map.get(a)) {
//                list.add(a);
//            }
//        }
        System.out.println(list);
    }
}
