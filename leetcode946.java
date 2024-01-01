import java.util.Stack;

public class leetcode946 {
    public static void main(String[] args) {
        int pushed[]={1,2,3,4,5};
        int popped[]={4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer>stack=new Stack<>();
        stack.push(pushed[0]);
        
        int k=0;
        int i=0;
        while(k<popped.length){
            if(pushed[i]<=popped[k]){
                i++;
                stack.push(pushed[i]);
            }if(pushed[i]==popped[k]){
                stack.pop();
                k++;
            }
        }
        return false;
    }
}
