import java.util.*;
public class leetcode56 {
  public static class Pair{
        int start;
        int end;
        public Pair(int start,int end){
           this.start=start;
            this.end=end;
        }
    }
    public static void main(String[] args) {
       int [][]arr={{1,3},{2,6},{8,10},{15,18}};
        int [][]ans= merge(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        Stack<Pair> stack = new Stack();
        stack.add(new Pair(intervals[0][0], intervals[0][1]));
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < intervals[0].length - 1; j++) {
                Pair top = stack.peek();
                int temp = top.start;
                int tem = top.end;
                int get = intervals[i][j];
                if (top.end >= intervals[i][j] && top.end < intervals[i][j + 1]) {
                    Pair t = stack.pop();
                    if (t.start > intervals[i][j]) {
                        stack.add(new Pair(intervals[i][j], t.end));
                    } else {
                        int e = intervals[i][j + 1];
                        int s = t.start;
                        stack.add(new Pair(t.start, intervals[i][j + 1]));
                    }
                } else {
                    if (top.start != intervals[i][j] && top.end != intervals[i][j + 1]) {
                        stack.add(new Pair(intervals[i][j], intervals[i][j + 1]));
                    }
                }
            }
        }
        int[][] ans = new int[stack.size()][2];
        Queue<Pair> q = new LinkedList(stack);
        int i = 0;
        while (!q.isEmpty()) {
            Pair s = q.poll();
            ans[i][0] = s.start;
            ans[i][1] = s.end;
            i++;
        }
        return ans;
    }
}
