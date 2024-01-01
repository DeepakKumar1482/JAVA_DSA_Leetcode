//This is the Introduction of hash set and some functions of set and implementation of hash set
package Heap;

import java.util.HashSet;

public class hasset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(19);
        set.add(2);
        set.add(20);
        set.add(19);
        set.add(1);
        if(set.contains(1)){
            set.remove(1);
        }
        System.out.println(set);
        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);
    }
}
