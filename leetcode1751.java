import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode1751 {
    static class Pair{
        int start;
        int end;
        int value;

        public Pair(int start,int end, int value) {
            this.start = start;
            this.end=end;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        maxValue(arr,3);
    }
    public static int maxValue(int[][] events, int k) {
        ArrayList<Pair>list=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0;i<events.length;i++){
            list.add(new Pair(events[i][0],events[i][1],events[i][2]));
        }
        pq.add(list.get(0).value);
        int max=list.get(0).value;
        int count=1;
        int sum=0;
        for (int i=1;i<list.size();i++){
            if(list.get(i-1).end<list.get(i).start && count<k){
                sum+=list.get(i-1).value+list.get(i).value;
                count++;
            }
            else {
                pq.add(list.get(i).value);
            }
        }
        pq.add(sum);
        System.out.println(pq.peek());
        return 0;
//        for (int i=0;i<list.size();i++) {
//            System.out.println(list.get(i).indsum);
//        }
//        return 0;
    }
}
