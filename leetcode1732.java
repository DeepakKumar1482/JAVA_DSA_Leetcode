public class leetcode1732 {
    public static void main(String[] args) {
        int []arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int []dp=new int[gain.length+1];
        int zero=0;
        int one=gain[0];
        int j=1;
        int max=Integer.MIN_VALUE;
        for(int i=2;i<gain.length;i++){
            int temp=one+gain[j];
            max=Integer.max(max,one+gain[j]);
            j++;
            one=temp;
        }
        // dp[gain.length]=dp[gain.length-1]+gain[gain.length-1];
        max=Integer.max(max,one+gain[gain.length-1]);
        return max;
    }
}
