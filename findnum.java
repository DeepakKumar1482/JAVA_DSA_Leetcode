import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class findnum {
    public static void main(String args[]){
//        HashSet<Integer>set=new HashSet<>();
//        System.out.println(set);
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",10000000);
        map.put("China",200000000);
        map.put("India",300000000);
        for (int num:map.values()){
            System.out.println(num);
        }
        for (String str:map.keySet()){
            System.out.println(str);
        }
        System.out.println(map.get("China"));
        for (String str:map.keySet()){
            System.out.println(map.get(str));
        }
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsValue(300000000));
        map.remove("China");
        System.out.println(map);
        map.remove("India",300000000);
        System.out.println(map);
//        System.out.println(map.size());
    }
}









