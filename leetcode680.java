import java.util.Stack;

public class leetcode680 {
    public static void main(String[] args) {
       boolean ans=validPalindrome("deeep");
        System.out.println(ans);
    }
    public static boolean validPalindrome(String s) {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.search(10));
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
