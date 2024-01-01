package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class buy_sell_stock2 {
    public static void main(String[] args) {
        int []prices={10,20,30};
        System.out.println(maxprofit(prices));
    }
    public static int maxprofit(int prices[]){
//        int mpist=0;
//        int leastsf=prices[0];
//        int []dpl=new int[prices.length];
//        for(int i=1;i<prices.length;i++){
//            if(prices[i]<leastsf){
//                leastsf=prices[i];
//            }
//            mpist=prices[i]-leastsf;
//            if(mpist>dpl[i-1]){
//                dpl[i]=mpist;
//            }
//            else{
//                dpl[i]=dpl[i-1];
//            }
//        }
//        int mpibt=0;
//        int maxat=prices[prices.length-1];
//        int []dpr=new int[prices.length];
//        for(int i=prices.length-2;i>=0;i--){
//            if(prices[i]>maxat){
//                maxat=prices[i];
//            }
//            mpibt=maxat-prices[i];
//            if(mpibt>dpr[i+1]){
//                dpr[i]=mpibt;
//            }
//            else{
//                dpr[i]=dpr[i+1];
//            }
//        }
//        int maxsum=0;
//        for(int i=0;i<prices.length;i++){
//            if(maxsum<dpl[i]+dpr[i]){
//                maxsum=dpl[i]+dpr[i];
//            }
//        }
//        return maxsum;
        int lsf=prices[0];
        int mpist=0;
        int []dpl=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            mpist=prices[i]-lsf;
            if(mpist>dpl[i-1]){
                dpl[i]=mpist;
            }
            else{
                dpl[i]=dpl[i-1];
            }
        }
        int maxat=prices[prices.length-1];
        int dpr[]=new int [prices.length];
        int mpibt=0;
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>maxat){
                maxat=prices[i];
            }
            mpibt=maxat-prices[i];
            if(mpibt>dpr[i+1]){
                dpr[i]=mpibt;
            }
            else{
                dpr[i]=dpr[i+1];
            }
        }
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int sum=dpl[i]+dpr[i];
            if(maxprofit<sum){
                maxprofit=sum;
            }
        }
        return maxprofit;
    }
}
