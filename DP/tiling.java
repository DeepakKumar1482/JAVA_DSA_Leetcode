package DP;

import com.sun.source.tree.BinaryTree;

//In this problem we have given a tile with the height 2 unit and length n unit
// and we have to fill that given tile area completely using the tile of 2*1 tile
public class tiling {
    public static void main(String[] args) {
        int length=4;
        System.out.println(tiling_with_dominoes(length));
    }
    public static int tiling_with_dominoes(int length){
        int []dp=new int[length+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[length];
    }
}
