import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode2078 {
    public static void main(String[] args) {
        int []arr={1,1,1,6,1,1,1};
        ArrayList<Integer >pq=new ArrayList<>();
        pq.add(3);
        pq.add(2);
        pq.add(5);
        pq.add(1);
        Collections.sort(pq);
        System.out.println(pq);
    }
    public static int maxDistance(int[] colors) {
        int a= (int) -2e31;
        int i=0,j=colors.length-1;
        int d;
        while(colors[i]==colors[j]) {
            j--;
        }
        d=j-i;
        j=colors.length-1;
        while(colors[i]==colors[j]) {
            i++;
        }
        d=Math.max(d,j-i);
        return d;
    }
}
