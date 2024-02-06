import java.util.ArrayList;

public class stackinjava {
    static class StackJava<T>{
        ArrayList<T>list;
        int size;
        public StackJava(){
            list=new ArrayList<>();
            size=0;
        }
        public void push(T num){
            list.add(num);
            size++;
        }
        public T pop(){
            T TopElement=list.remove(list.size()-1);
            size--;
            return TopElement;
        }
        public T Peek(){
            T TopElement=list.get(list.size()-1);
            return TopElement;
        }
        public int Size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0?true:false;
        }
    }
    public static void main(String[] args) {
        StackJava<Integer>stack=new StackJava<>();
        stack.push(3);
        stack.push(1);
        stack.push(5);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(7);
        stack.push(9);
        System.out.println("Size of stack :- "+stack.Size());
        System.out.println("Peek Element:- "+stack.Peek());
    }
}








