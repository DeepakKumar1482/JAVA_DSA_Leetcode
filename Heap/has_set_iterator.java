package Heap;

import java.util.HashSet;
import java.util.Iterator;

public class has_set_iterator {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("Lucknow");
        cities.add("Bombay");
        cities.add("Noida");
        cities.add("Bengaluru");
        Iterator it=cities.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        for (String city:cities){
            System.out.println(city);
        }
    }
}
