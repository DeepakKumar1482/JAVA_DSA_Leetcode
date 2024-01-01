package Tutioln.date18;

import java.util.PriorityQueue;

public class leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {

        long start=1;
        long end=x;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid>x){
                end=mid-1;
            }
            else if(mid*mid<x){
                start=mid+1;
                ans=mid;
            }
            else{
                ans=mid;
                break;
            }
        }
        return (int) ans;
    }
}
