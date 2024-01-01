package DP;

public class bus_sell_stock1 {
    public static void main(String[] args) {
        int []prices={4,6,1,7,2,9,7};
        System.out.println(maxprofit(prices));
    }
    public static int maxprofit(int []prices){
        int lsf=Integer.MAX_VALUE;
        int profit_if_sold_today=0;
        int max_profit=0;
        for(int price:prices){
            if(price<lsf){
                lsf=price;
            }
            profit_if_sold_today=price-lsf;
            if(profit_if_sold_today>max_profit){
                max_profit=profit_if_sold_today;
            }
        }
        return max_profit;
    }
}
