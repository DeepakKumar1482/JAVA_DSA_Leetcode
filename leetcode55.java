public class leetcode55 {
    public static void main(String[] args) {
        int []nums={1,2};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        boolean []dp=new boolean[nums.length];
        int indx=nums[0];
        dp[0]=true;
        int i=1;
        int p=0;
        for(;i<nums.length;){
            if(nums[i]==0 && dp[i+1]==false){
                return false;
            }

            if(dp[i-1]) {
                dp[i] = true;
            }
            if(i==indx){
                p++;
                i=p;
                indx=nums[p]+i-1;
            }
            i++;
            if(dp[nums.length-1]){
                return true;
            }
        }
        return false;
    }
}
