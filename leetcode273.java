import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class leetcode273 {
    public static void main(String[] args) {

//        int num=123;
        LinkedList<Integer>list=new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(0);
        Collections.sort(list);
        System.out.println(list.get(3));

    }

}

