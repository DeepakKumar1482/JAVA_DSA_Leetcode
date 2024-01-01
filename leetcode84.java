import java.util.Stack;

public class leetcode84 {
    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftBoundaries = new int[n];
        int[] rightBoundaries = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Calculate left boundaries for each histogram bar
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            leftBoundaries[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        stack.clear();

        // Calculate right boundaries for each histogram bar
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            rightBoundaries[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }

        int maxArea = 0;

        // Calculate the area for each histogram bar
        for (int i = 0; i < n; i++) {
            int area = (rightBoundaries[i] - leftBoundaries[i] + 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

}

