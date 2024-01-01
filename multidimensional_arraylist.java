//2D ArrayList Initialization,and filling elements and accessing the elements of main list;
import java.util.ArrayList;
public class multidimensional_arraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(96);
        arr.add(67);
        arr.add(78);
        list.add(arr);
        ArrayList<Integer>ar=new ArrayList<>();
        ar.add(54);
        ar.add(54);
        ar.add(78);
        ar.add(99);ar.add(67);
        ar.add(23);
        list.add(ar);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
