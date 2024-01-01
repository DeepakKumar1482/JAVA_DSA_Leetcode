// Finding all the possible ways to rach the last index of a given matrix using recursion
//just give number of rows and columns of the matrix of which matrix paths you want to see
//Rule="you can either go right or down"
package maze_backtracking.java;
import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maze_problem {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int ans=sortest_path(row,col);
        System.out.println(ans);
    }
    static int sortest_path(int row , int col){
        if(row==1 || col==1) {
            return 1;
        }
        int down=sortest_path(row-1,col);
        int right=sortest_path(row,col-1);
        return down+ right;
    }
}
