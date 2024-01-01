public class leetcode486 {
    public static void main(String[] args) {
        int []arr={1,5,2};
        System.out.println(PredictTheWinner(arr));
    }
    public static boolean PredictTheWinner(int[] nums) {
        int i=0,j=nums.length-1;
        int first=0;
        int second=0;
        while(i<j){
            if(nums[i]>nums[j]){
                first+=nums[i];
                ++i;
            }
            else{
                first+=nums[j];
                --j;
            }
            if(nums[i]<nums[j]){
                second+=nums[i];
                ++i;
            }
            else{
                second+=nums[j];
                --j;
            }
        }
        return first>=second;
    }
}
