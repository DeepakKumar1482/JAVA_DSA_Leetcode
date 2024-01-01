import java.util.ArrayList;
import java.util.Arrays;

public class leetcode137 {
    public static void main(String[] args) {
        int []arr={0,1,0,1,0,1,99};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
//        String helper="";
//        for ( int i=0;i<nums.length;i++) {
//            helper += Integer.toString(nums[i])+"-";
//        }
//        System.out.println(helper);
//        for (int i=0;i<nums.length;i++){
//            if(!helper.contains(Integer.toString(nums[i]))){
//                return nums[i];
//            }
//        }
        Arrays.sort(nums);
        int i=0;
        while (i<nums.length){
            if(i==nums.length-1){
                return nums[i];
            }
          else if(nums[i]==nums[i+1]){
                i=i+3;
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}
