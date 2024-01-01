import java.util.LinkedList;
import java.util.Stack;

public class stack_que_leetcode {
    public static void main(String[] args) {

        String str="";
        System.out.println(str.isEmpty());
        Stack<String>stack_open=new Stack<>();
        Stack<String >stack_close=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack_open.push("(");
            }
            else{
                stack_close.push(")");
            }
        }
        int max=Math.max(stack_open.size(),stack_close.size());
        int min=Math.min(stack_open.size(),stack_close.size());
        System.out.println(max-min);
    }
}
