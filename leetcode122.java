public class leetcode122 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
       int ans= maxProfit(arr);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int maxprofit=0;
        for (int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else{
                maxprofit+=prices[i]-buy;
                buy=prices[i];
            }
        }
        return maxprofit;
    }
}
