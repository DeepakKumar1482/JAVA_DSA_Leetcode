package Tutioln;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for ( int i=0;i<6;i++){
            list.add(i);
        }
        System.out.println(list);
        list.set(2,9);
        System.out.println(list);
//        for ( int i=0;i<list.size();i++){
//            if(i==2){
//                int temp=list.get(i);
//                list.set(i,0);
//            }
//            list.set(i,list.get(i));
//        }
//        list.remove(2);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(5));
        list.add(2,5);
        System.out.println(list);
    }
}
