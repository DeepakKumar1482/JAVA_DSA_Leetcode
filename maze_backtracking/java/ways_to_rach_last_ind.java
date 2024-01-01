package maze_backtracking.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ways_to_rach_last_ind {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        String str="";
        path(row,col,str);
    }
    static void path(int row , int col,String str){
        ArrayList<String>list=new ArrayList<>();
        if(row== 1  && col==1){
                System.out.println(str);
            return ;
        }
            if(row>=1) {
                path(row - 1, col, str.concat("D"));
            }
             if (col>=1) {
                path(row,col-1,str.concat("R"));
            }

    }
}
