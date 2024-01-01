package Heap;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class linked_hashsat {
    public static void main(String[] args) {
        TreeSet<Integer> lhs=new TreeSet<>();
        lhs.add(2);
        lhs.add(1);
        lhs.add(5);
        lhs.add(0);
        lhs.add(9);
        System.out.println(lhs);
        for (Integer i:lhs){
            System.out.println(i);
        }
    }
}
