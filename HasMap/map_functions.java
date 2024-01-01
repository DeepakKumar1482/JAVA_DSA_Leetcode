//Introduction of HasMap and its functions and implementations of the those functions
package HasMap;
import java.util.HashMap;
import java.util.Set;

public class map_functions {
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",150);
        hm.put("China",100);
        hm.put("Rusia",80);
        hm.put("Pakistan",0);
        hm.put("Nepal",20);
//        int population=hm.get("India");
//        System.out.println(population);
//        If we pass any key which does not exist then we get null;
//        System.out.println(hm.get("pakistan"));
//        Contains key = This function return true if the key passed in the function exist otherwise return false ;
//        System.out.println(hm.remove("China"));
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm);
        
//        Through this we can get the keys of the HasMap and we will get the set of keys
        Set<String >keys=hm.keySet();
        System.out.println(keys);
        for (String k:keys) {
            System.out.println("Key = "+k + ", value of the key "+k+" is ="+hm.get(k));
        }

//        entrySet = this return the set of keys and values
//        Set<String,Integer>es=hm.entrySet();

    }
}
