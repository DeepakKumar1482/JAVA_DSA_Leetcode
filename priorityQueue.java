import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
//        Comparator.reverseOrder() use this function to get result in the reverse order
        q.add(4);
        q.add(1);
        q.add(12);
        q.add(5);
        System.out.println(q.size());
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
