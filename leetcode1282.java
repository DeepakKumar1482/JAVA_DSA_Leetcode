import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1282 {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,1,1,1};
        groupThePeople(arr);
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int copy[]=groupSizes.clone();
        Arrays.sort(copy);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++) {
            List<Integer> l = new ArrayList<>();
            int prev=0;
            int j = 1;
            int c=0;
//            if (groupSizes[i] != Integer.MAX_VALUE) {
                for (; j <= copy[i]; j++) {
                    int k = prev;
                    for (; k < groupSizes.length; k++) {
                        if (groupSizes[k] == copy[i] && groupSizes[k] != Integer.MAX_VALUE) {
                            groupSizes[k] = Integer.MAX_VALUE;
                            c++;
                            break;
                        }
                    }
                    if(c!=0) {
                        prev = k;
                        l.add(k);
                    }
                }
                if(!l.isEmpty()) {
                    list.add(l);
                }
            }
//        }
        System.out.println(list);
        return list;
    }
}
