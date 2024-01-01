import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Stack;

public class valid {
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for(char a:s.toCharArray())
        {
//            if(a=='(' || a=='{' || a=='['){
//                left.push(a);
//            }
            if(a=='(' || a=='{' || a=='['){
                 left.push(a);
             }
//            else if(a==')' && !left.isEmpty() && left.pop()=='('){
//            continue;
//            }
            else if(a==')' && !left.isEmpty() && left.pop()=='('){
                continue;
            }


            else if(a=='}' && !left.isEmpty() && left.pop()=='{'){
                continue;
            }


//            else if(a=='}' && !left.isEmpty() && left.pop()=='{'){
//                continue;
//            }


            else if(a==']' && !left.isEmpty() && left.pop()=='['){
                continue;
            }

//            else if(a==']' && !left.isEmpty() && left.pop()=='['){
//                continue;
//            }
            else{
                return false;
            }
        }
//        Syleftem.out.println(left);
        return left.isEmpty();
    }
}
