import java.util.Stack;

public class leetcode1209 {
    public static void main(String[] args) {
        leetcode1209 obj=new leetcode1209();
        System.out.println(obj.removeDuplicates("deeedbbcccbdaa",3));
    }
    class Utility{
        char ch;
        int streak;
        public Utility(char ch,int idx){
            this.ch=ch;
            this.streak=idx;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Utility> stack=new Stack();
        stack.push(new Utility(s.charAt(0),1));
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            if(!stack.isEmpty() && stack.peek().ch==curr){
                int currstreak=stack.peek().streak;
                stack.push(new Utility(curr,currstreak+1));
            }else{
                stack.push(new Utility(curr,1));
            }
            if(stack.peek().streak==k){
                int flag=k;
                while(flag!=0){
                    stack.pop();
                    flag--;
                }
            }
        }
        String result="";
        while(!stack.isEmpty()){
            result+=Character.toString(stack.pop().ch);
        }
        return result;
    }
}
