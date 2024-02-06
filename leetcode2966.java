import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2966 {
    public static void main(String[] args) {
        int []nums={1,3,4,8,7,9,3,5,1};
        int n=123;
        List<Integer>l=new ArrayList<>();

        int digits= (int) Math.log10(n);
        System.out.println(digits);
//        System.out.println(divideArray(nums,2));
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int [][]matrix=new int[nums.length/3][3];
        int j=0;
        for(int i=0;i<nums.length-3;){
            if((nums[i+2]-nums[i])<=k){
                matrix[i][0]=nums[i];
                matrix[i][1]=nums[i+1];
                matrix[i][2]=nums[i+2];
                i=i+3;
            }else{
                return new int[0][0];
            }
        }
        return matrix;
    }
}
