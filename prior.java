import java.util.PriorityQueue;

public class prior {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(12);
        pq.add(2);
        pq.add(0);
        while (!pq.isEmpty()){
//            System.out.println(pq.peek());
            System.out.println("size => "+pq.size());
            System.out.println(pq.poll());
        }
        System.out.println(pq.poll());
//        System.out.println(pq.remove());






    }
}
