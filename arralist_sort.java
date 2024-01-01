//for sorting an arraylist in ascending order use "Collections.sort(list);
import java.util.ArrayList;
import java.util.Collections;
public class arralist_sort {
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(34);
    list.add(12);
        list.add(54);
        list.add(76);
        list.add(9);
        list.add(78);
        list.add(90);list.add(28);list.add(62);
        list.add(22);
        list.add(8);
        list.add(29);list.add(49);list.add(45);
        Collections.sort(list);
        System.out.println(list);
}

}
