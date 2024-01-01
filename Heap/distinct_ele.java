package Heap;

import java.util.HashSet;

public class distinct_ele {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs.size());
    }
}
