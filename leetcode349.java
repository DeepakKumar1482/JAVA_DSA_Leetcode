import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class leetcode349 {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        int ar[]={2,2};
        intersection(arr,ar);
    }
    public static void intersection(int[] nums1, int[] nums2){
//        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        int len= Math.min(nums1.length,nums2.length);
        int ans[]=new int[len];
        for (int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        int i=0;
        for (int a:set1){
            if(set2.contains(a)){
                ans[i]=a;
                i++;
            }
        }
           }
}
