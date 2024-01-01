//Finding all the paths to reach the last index of the given matrix when you
// can go down ,right,upper,left as well {using backtracking I have solved this
package maze_backtracking.java;
import java.util.Scanner;
public class all_directions {
    public static void main(String[] args) {
        boolean[][] arr ={{true,true,true},{true,true,true},{true,true,true}};
        possible_paths("",0,0,arr);
    }
    static void possible_paths(String str,int row,int col,boolean [][]arr){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(str);
            return ;
        }
        if(!arr[row][col]){
            return;
        }
        arr[row][col]=false;
        if(row<arr.length-1) {
            possible_paths(str+'D',row+1,col,arr);
        }
        if(col<arr[0].length-1) {
            possible_paths(str+'R',row,col+1,arr);
        }
        if(row>0 ){
            possible_paths(str+"U",row-1,col,arr);
        }
        if(col>0){
            possible_paths(str+"L",row,col-1,arr);
        }
        arr[row][col]=true;
    }
}
