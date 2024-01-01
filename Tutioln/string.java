package Tutioln;

import java.util.ArrayList;
import java.util.List;

public class string {
    public static void main(String[] args) {
//        array, stack , Queue, linkedlist,arrylist,hashmap,priority queue
//        tree=binary tree ,segment tree, binary search tree, map

        String str="abbbcddbdb";
//        List<Integer>list=new ArrayList<>();
        int max=0;
        char character='-';
        for (int i=0;i<str.length();i++){
//            ArrayList<Integer>list=new ArrayList<>();
            int count=1;
            for ( int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                character=str.charAt(i);
                max=count;
            }
        }

        System.out.println(character+" is present : "+max+"times");
    }
}
