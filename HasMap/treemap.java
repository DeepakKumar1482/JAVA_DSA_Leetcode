//This is about the implementation of treemap
//in threemap key value pair are sorted according to keys and
// every time you will get sorted treemap according to the keys
package HasMap;
import java.util.SimpleTimeZone;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String>tm=new TreeMap<>();
        tm.put(1,"India");
        tm.put(2,"Rusia");
        tm.put(0,"Usa");
        tm.put(4,"Germany");
        System.out.println(tm);
    }
}
