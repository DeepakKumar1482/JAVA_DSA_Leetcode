package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascal_triangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static  List<List<Integer>> generate(int numRows){
        int [][]dp=new int[numRows][numRows];
        dp[0][0]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        for(int i=2;i<numRows;i++){
            for (int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=1;
                }
                else if(j==1){
                    dp[i][j]=i;
                }
                else{
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        for(int i=0;i<numRows;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        ArrayList<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>s=new ArrayList<>();
            for(int j=0;j<=i;j++){
                s.add(dp[i][j]);
            }
            l.add(s);
        }
        return l;
    }
}
//    List<List<Integer>>l=new ArrayList<>();
//        for(int i=1;i<=numRows;i++){
//                List<Integer>s=new ArrayList<>();
//        for (int j=1;j<=i;j++){
//        if(i==1){
//        s.add(i);
//        }
//        else if(i==2){
//        s.add(i);
//        }
//        else{
//
//        }
//        }
//        }
