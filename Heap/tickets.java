//In this question some cities are given and you have to find the correct root
// to go from one city to another city \
//        chennai -> bengaluru
//        mumbai -> delhi
//        goa -> chennai
//        delhi -> goa
//        left one are the cities from and right one are the destination cities
//        we have to find the root in which there will be no city for twice
package Heap;

import java.util.HashMap;

public class tickets {
    public static String getstart( HashMap<String ,String>tickets){
        HashMap<String ,String>revhs=new HashMap<>();
        for(String key:tickets.keySet()){
           revhs.put(tickets.get(key),key);
        }
        for (String key:tickets.keySet()){
            if(!revhs.containsKey(key)){
                return key;//Starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String>tickets=new HashMap<>();
        tickets.put("chennai" ,"bengaluru");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");
       String start= getstart(tickets);
        System.out.print(start);
        for (String key:tickets.keySet()){
            System.out.print("-> "+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
