package DP;

import java.util.ArrayList;
import java.util.List;

public class triangle {
    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<5;i++){
            List<Integer>s=new ArrayList<>();
            for(int j=0;j<4;j++){
                s.add(j);
            }
        }

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j));
            }
        }
        System.out.println("Hello");
//        minimumTotal()
    }
//    public static int minimumTotal(List<List<Integer>> triangle) {
//
//    }
}
