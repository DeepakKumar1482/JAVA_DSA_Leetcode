//This is about the implementation of linkedhasmap
//in linkedhashmap nodes(insertion is in order) so if we want an ordered hasmap then linkedhasmap is good choice
package HasMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class linkedhasmap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",1);
        lhm.put("Rusia",2);
        lhm.put("china",3);
        System.out.println(lhm);
        TreeSet<Integer> set=new TreeSet<>();
        set.add(4);
        set.add(0);
        set.add(-1);
        set.add(9);
        set.add(5);
        System.out.println(set);
    }
}
