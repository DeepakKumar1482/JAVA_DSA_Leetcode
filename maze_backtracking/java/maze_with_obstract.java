//Finding the number of paths to reach the last index of the given matrix
//but you can go right , down but there is a barrier on digonal and you can not go right or down to that
package maze_backtracking.java;
public class maze_with_obstract {
    public static void main(String[] args) {
        boolean[][] arr ={{true,true,true},{true,false,true},{true,true,true}};
        possible_paths("",arr,0,0);
    }
    static void possible_paths(String str,boolean [][]arr,int row,int col){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(str);
            return ;
        }
        if(!arr[row][col]){
            return;
        }
        if(row<arr.length-1) {
              possible_paths(str+'D',arr,row+1,col);
        }
        if(col<arr[0].length-1) {
             possible_paths(str+'R',arr,row,col+1);
        }
    }
}
