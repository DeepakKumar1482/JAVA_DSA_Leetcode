//Number of paths to reach the last index of a given matrix
// while you can go down ,right,digonally as well
package maze_backtracking.java;

import java.util.Scanner;

public class last_index {
    public static void main(String str[]){
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int ans=possible_paths(row,col);
        System.out.println(ans);
    }
    static int possible_paths(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int down=possible_paths(row-1,col);
        int right=possible_paths(row,col-1);
        int digonally=possible_paths(row-1,col-1);
        return down+right+digonally;
    }
}
