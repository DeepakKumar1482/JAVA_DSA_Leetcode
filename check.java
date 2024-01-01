import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class check {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(0);
        list.add(1);
        for ( int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
