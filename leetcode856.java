import java.util.Stack;

public class leetcode856 {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()))()"));
    }
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                int previousScore = stack.pop();
                score = previousScore + Math.max(2 * score, 1);
            }
        }

        return score;
    }
}
