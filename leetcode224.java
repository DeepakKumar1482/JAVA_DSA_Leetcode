import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class leetcode224 {
    public static void main(String[] args) {
//        String s = "(1+(4+5+2)-3)+(6+8)";
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
    static String another="";
    public static int calculate(String s) {
        infix(s);

        return postfix(another);
    }
    public static int precedence(char operator){
        if(operator=='+' || operator=='-'){
            return 1;
        }
        else if(operator=='*' || operator=='/'){
            return 2;
        }
        return 0;
    }
    public static void infix(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                another+=s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                while(stack.peek()!='('){
                    another+=stack.pop();
                }
                stack.pop();
            }
            else{
                char curr=s.charAt(i);
                while(!stack.isEmpty() && precedence(curr)<=precedence(stack.peek()) && s.charAt(i)!=' '){
                    another+=stack.pop();
                }
                if(s.charAt(i)!=' ') {
                    stack.push(curr);
                }
            }
        }
        while(!stack.isEmpty()){
            another+=stack.pop();
        }
    }
    public static int postfix(String another){
        Stack<Integer>ans=new Stack<>();
        for (int i=0;i<another.length();i++){
            if(Character.isDigit(another.charAt(i))){
                ans.push(another.charAt(i)-'0');
            }
            else{
                int second=ans.pop();
                int first=ans.pop();
                if(another.charAt(i)=='+'){
                    ans.push(second+first);
                }
                else if(another.charAt(i)=='-'){
                    ans.push(first-second);
                }
                else if(another.charAt(i)=='*'){
                    ans.push(first*second);
                }
                else if(another.charAt(i)=='/'){
                    ans.push(first/second);
                }
            }
        }
        System.out.println(ans);
        Queue<Integer>q=new LinkedList<>(ans);
        int actual=0;
        while(!q.isEmpty()) {
            actual=actual*10+q.poll();
        }
//        System.out.println(q);
//        long num=0;
//        if(ans.size()>1){
//            while(!ans.isEmpty()) {
//                num = num * 10 +ans.pop();
//            }
//            int actual=0;
//            while(num>0){
//                int rem= (int) (num%10);
//                actual=actual*10+rem;
//                num=num/10;
//            }
            return actual;
    }
}
