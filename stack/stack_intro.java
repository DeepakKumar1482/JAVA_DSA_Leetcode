//Initialization of stack and pop and push method for inserting and popping out the element from the stack
package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class stack_intro {
    static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();

        public static void push(int val) {
            stack.add(val);
        }

        public static int poll() {
            if (stack.isEmpty()) {

                System.out.println("Stack is empty");
                return -1;
            }
            return stack.remove(stack.size() - 1);
        }

        public static int peek() {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack.get(stack.size() - 1);
        }

        public static int size() {
            if (stack.isEmpty()) {
                return 0;
            }
            return stack.size();
        }
    }
    public static void main(String[] args) {
//        Stack<Integer>stack=new Stack<>();
//        stack.push(12);
//        stack.push(23);
//        stack.push(45);
//        stack.push(56);
//        stack.push(67);
//        stack.push(87);
//        stack.push(90);
//        System.out.println(stack.pop());
        Stack st=new Stack();
        st.push(4);;
        st.push(10);
        System.out.println(st.poll());
        System.out.println(st.peek());
        System.out.println(st.poll());
        System.out.println(st.poll());
    }
}
