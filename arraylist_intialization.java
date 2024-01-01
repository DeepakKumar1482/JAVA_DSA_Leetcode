//Declaration and use of Arraylist and doing some task using Arraylist;
import java.util.*;
import java.util.Collections;
public class arraylist_intialization {
    public static void main(String args[]){
      ArrayList<Integer>list=new ArrayList<>();
      list.add(4);
      list.add(5);
      list.add(8);
      list.add(34);
        list.add(87);
        list.add(12);
        list.add(98);
        list.add(65);
        list.add(9);
      System.out.println(list);
      //For getting the value of any index in a list use "LIST.GET" FUNCTION;
      int element=list.get(2);
      System.out.println(element);
      //For removing value of any index use "LIST.REMOVE" FUNCTION";
      list.remove(1);
      System.out.println(list);
      //For changing the value of any index use "LIST.SET" FUNCTION;
      list.set(1,14);
      System.out.println(list);
      //For checking whether any number exist in or not in array list, use "LIST.CONTAINS" FUNCTION , IT RETURNS ANSWER IN TRUE OR FALSE FORM;
      System.out.println(list.contains(4));
      System.out.println(list.contains(11));
      //For adding any number without at any index and the all numbers after that index will move back for it Use"LIST.ADD(INDEX,NUMBER), FUNCTION
      list.add(1,45);
      System.out.println(list);
      //For getting the size of the arraylist use"SIZE"function;
        System.out.println(list.size());
        //For sorting the arraylist in ascending order;
        Collections.sort(list);
        System.out.println(list);
        // for sorting the arraylist in descending order;
      Collections.sort(list,Collections.reverseOrder());
      System.out.println(list);
    }
}
