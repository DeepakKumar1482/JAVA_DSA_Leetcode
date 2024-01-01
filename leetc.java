import java.util.Stack;
import java.util.zip.CheckedInputStream;

public class leetc {
    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights){
        int len=heights.length;
        int []left=new int[len];
        int []right=new int[len];
        Stack<Integer>st=new Stack<>();
        for (int i=0;i<len;i++){
            if (!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=0;
            }else{
                left[i]=st.peek()+1;
            }
            st.push(i);
        }
        st.clear();
        for ( int i=len-1;i>=0;i--){
            if (!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=len-1;
            }else{
                right[i]=st.peek()-1;
            }
            st.push(i);
        }
        int max=0;
        for ( int i=0;i<len;i++){
            int area=(right[i]-left[i]+1)*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
}
