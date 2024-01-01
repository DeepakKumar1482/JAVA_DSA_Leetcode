import java.util.*;

public class leetcode27 {
    public static void main(String[] args) {
        int arr[]={3,2,2,3};
       List<Integer> list=new ArrayList<>();
       list.add(3);
       list.add(4);
       list.add(3);
       for(int i=0;i<list.size();i++){
           arr[i]=list.remove(i);
       }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
       pq.add(5);
       pq.add(6);
       pq.add(6);
       pq.add(6);
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(5);
        System.out.println(ts.contains(5));
       for(int i=pq.size();i>0;i--){
           System.out.println("This is"+pq.remove());
       }
//        System.out.println(pq.remove(6));
        System.out.println( pq);
//       list.remove()
        Stack<Integer>stack=new Stack<>();
        stack.push(4);
        stack.push(5);
//        stack.;
    }

}
