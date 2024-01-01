import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuqlinkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queuq{
        static Node head=null;
        static Node tail=null;
        public static boolean isempty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode =new Node(data);
            if(tail==null){
                 tail=head=newNode;
                 return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isempty()){
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
//                1
//               / \
//              2   3
//             / \   \
//            4   5   6
//           / \     /
//          8   9   7

    public static void main(String[] args) {
        Queuq q=new Queuq();
        q.add(7);
        q.add(5);
        q.add(1);
        q.add(10);
        while (!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
