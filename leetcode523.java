import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class leetcode523 {
    public static void main(String[] args) {
        int arr[]={23,2,4,6,7};
        int k=6;
        int sum=0;
        int i=0;
        checkSubarraySum(arr,k);
    }
    public static void checkSubarraySum(int[] nums,int k) {
//        if(i==nums.length){
//            System.out.println(sum);
//            return;
//        }
//        checkSubarraySum(nums,i+1,sum+nums[i],count+1);
//        checkSubarraySum(nums,i+1,su  m,count);
        List<Integer>list=new ArrayList<>();
       for ( int i=0;i<nums.length;i++){
           int sum=0;
//           list.add(nums[i]);
           for (int j=i;j<nums.length;j++){
               sum+=nums[j];
               list.add(sum);
               if(sum%k==0){
//                   return true;
               }
           }
//           list.add(sum);
       }
//       return false;
//        System.out.println(list);
    }
}
