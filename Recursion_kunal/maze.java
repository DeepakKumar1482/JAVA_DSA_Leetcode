package Recursion_kunal;

import java.util.Stack;

public class maze {
    public static void main(String[] args) {
        ways(3,3,"");
    }
    public static void ways(int r,int c,String str){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1) {
            
            ways(r - 1, c, str + 'B');
        }
        if(c>1) {
            ways(r, c - 1, str + 'R');
        }
    }
}
