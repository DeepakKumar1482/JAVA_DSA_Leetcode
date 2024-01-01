public class leetcode1578 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,1};
        System.out.println(minCost("aabaa",arr));
    }
    public static int minCost(String colors, int[] neededTime) {
        //   int []dp=new int[neededTime+1];
        int mintime=Integer.MAX_VALUE;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                mintime+=Math.min(neededTime[i],neededTime[i+1]);
                if(neededTime[i]>neededTime[i+1]){
                    neededTime[i+1]=neededTime[i];
                }
            }
        }
        return mintime;
    }
}
