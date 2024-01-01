package priorityQueue_or_heap.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue_intro {
    public static void main(String[] args) {
//        for getting elements in
//        descending order use ( Comparator.reverseOrder()) in PriorityQueue<>(comparator.reverseOrder);
//        priority Queue by default add all the elements in ascending order and if you will get peek element you
//        will get smallest element first end so on.
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(12);
        pq.add(5);
        pq.add(9);
        pq.add(2);
        pq.add(14);
        pq.add(0);
        pq.add(7);
        while (!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
//        System.out.println(pq.size());
//        System.out.println(pq.);
    }
}
