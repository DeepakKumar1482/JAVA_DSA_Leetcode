package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Lexiographical_number {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=1;i<=9;i++){
            lexicalOrder(i,list,13);
        }
        System.out.println(list);
    }
    public static void lexicalOrder(int num,ArrayList<Integer>list,int n){
        if(num>n){
            return;
        }
        list.add(num);
        for(int j=0;j<=9;j++){
            lexicalOrder(10*num+j,list,n);
        }
    }
}
