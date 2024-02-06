import java.util.Stack;

public class leetcode150 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        String []str={"10","6","9","3","+","" +"-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(str));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack();
        stack.push(Integer.parseInt(tokens[0]));
        int ans=0;
        int i=1;
        while(!stack.isEmpty()){
            String str=tokens[i];
            if(!Character.isDigit(str.charAt(0)) && str.length()==1){
                int num1=stack.pop();
                int num2=stack.pop();
                if(str.charAt(0)=='*'){
                    ans=num2*num1;
                }else if(str.charAt(0)=='/'){
                    ans=num2/num1;
                }else if(str.charAt(0)=='+'){
                    ans=num2+num1;
                }else{
                    ans=num2-num1;
                }
                stack.push(ans);
            }
            else{
                int num=Integer.parseInt(tokens[i]);
                stack.push(Integer.parseInt(tokens[i]));
            }
            if(i==tokens.length-1){
                return stack.pop();
            }
            i++;
        }
        return ans;
    }
}
