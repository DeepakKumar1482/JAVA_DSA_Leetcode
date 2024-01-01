//Reverse a given linkedlist leetcode:-206(Reverse Linked List)
package linkedlist;

import java.util.LinkedList;

public class linkedlist_reverse {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(null);
        int i=0;
        while(linkedList.get(i)!=null){
        System.out.print(linkedList.get(i)+"->");
        i++;
        }
    }
}
