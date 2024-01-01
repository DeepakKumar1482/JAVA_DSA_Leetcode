package linkedlist;

import java.util.*;

public class stack_datastr {
    public static void main(String[] args) {
//        Stack<Integer>stack=new Stack<>();
//        stack.push(12);
//        stack.push(34);
//        stack.push(87);
//        stack.push(97);
//        stack.push(167);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        Queue<Integer>queue=new LinkedList<>();
//        queue.add(12);
//        queue.add(45);
//        queue.add(76);
//        queue.add(90);
//        queue.add(48);
//        queue.add(63);
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue);
        Deque<Integer>deque=new ArrayDeque<>();
        deque.add(45);
        deque.add(89);
        deque.addFirst(36);
        deque.addLast(78);
        System.out.println(deque);
    }
}
