import java.util.HashMap;
import java.util.HashSet;

public class leetcode2442 {
    public static void main(String[] args) {
        int arr[]={1,13,10,12,31};
    }
    public int countDistinctIntegers(int[] nums){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int sum=0;
            while (nums[i]>0){
                int rem=nums[i]%10;
                sum=sum*10+rem;
                nums[i]=nums[i]/10;
            }
            set.add(sum);
        }
        return set.size();
    }
}
