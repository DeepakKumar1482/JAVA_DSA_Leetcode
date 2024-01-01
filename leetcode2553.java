import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode2553 {
    public static void main(String[] args) {
        int nums[]={13,25,83,77};

        System.out.println(Arrays.toString(separateDigits(nums)));
    }
    public static int[] separateDigits(int[] nums){
//        List<Integer>list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            String number=Integer.toString(nums[i]);
//            for(int j=0;j<number.length();j++){
//                list.add(Integer.parseInt(String.valueOf(number.charAt(j))));
//            }
//        }
//        int []ans=new int[list.size()];
//        int k=0;
//        for (int a:list) {
//            ans[k]=a;
//            k++;
//        }
//        return ans;
        String a="";
        for (int i=0;i<nums.length;i++){
            a=a+Integer.toString(nums[i]);
        }
        int ans[]=new int[a.length()];
        for (int i=0;i<a.length();i++){
            ans[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return ans;
    }
}
