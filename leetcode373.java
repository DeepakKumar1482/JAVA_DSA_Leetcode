import java.util.*;

public class leetcode373 {
    public static void main(String[] args) {
        int []nums1={1,1,2};
        int []nums2={1,2,3};
        kSmallestPairs(nums1,nums2,2);
    }
    public static void kSmallestPairs(int[] nums1, int[] nums2, int k){
//        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        PriorityQueue<List<Integer>>pq=new PriorityQueue<>();
            for ( int i=0;i<nums1.length;i++){
                ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums1[i],nums2[i]);
                System.out.println(list);
                    pq.add(list);
                ArrayList<Integer>an=new ArrayList<>();
                    an.add(nums1[i+1],nums2[i]);
                    pq.add(an);
                ArrayList<Integer>newer=new ArrayList<>();
                    newer.add(nums1[i],nums2[i+1]);
                    pq.add(newer);
            }
            for ( int i=0;i<k;i++){
                ans.add((ArrayList<Integer>) pq.peek());
            }
        System.out.println(ans);
    }
}
