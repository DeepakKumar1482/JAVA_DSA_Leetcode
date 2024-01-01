import java.util.PriorityQueue;

public class p {
    public static void main(String[] args) {
//        {1,5,12,14,16,3,0,18}
//        3
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(2);
        pq.add(11);
        pq.add(1);
        pq.add(14);
        pq.add(0);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
        System.out.println(pq.size());
//        System.out.println("This is poll function  =-> " +pq.poll());
        System.out.println("This is  function => " +pq.remove());
    }
}
