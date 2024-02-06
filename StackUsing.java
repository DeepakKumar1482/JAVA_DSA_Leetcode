import java.util.Stack;
public class StackUsing {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        String s="dee";
        System.out.println("Pop element "+stack.pop());
        System.out.println("Peek element"+stack.peek());
        System.out.println("stack size=: "+stack.size());
        System.out.println("stack isEmpty :- "+stack.isEmpty());
    }
}
