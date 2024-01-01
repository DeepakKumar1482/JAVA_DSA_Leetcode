import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>(12);
        list.add(23);
        list.add(210);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23); list.add(23);
        list.add(23);
        list.add(263);
        list.add(25); list.add(23);
        list.add(23);
        list.add(23); list.add(23);
        System.out.println(list);
        System.out.println(list.contains(23));
        list.set(0,456);
        System.out.println(list);
//now value of [0] has been updated
        list.remove(1);
        System.out.println(list);
        //

            }
}
