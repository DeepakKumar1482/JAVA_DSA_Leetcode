import java.util.HashMap;

public class leetcode121 {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
    public static void maxProfit(int[] prices) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<prices.length;i++){
            map.put(prices[i],i);
        }
        System.out.print(map.toString());
        int max=0;
        for (Integer a:map.keySet()){
            if(map.get(a)<prices.length-1){

            }
        }
        }
    }
//}
