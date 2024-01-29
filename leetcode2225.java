import java.util.*;
public class leetcode2225 {
    public static void main(String[] args) {
        int [][]arr={
                {1,3},
                {2,3},
                {3,6},
                {5,6},
                {5,7},
                {4,5},
                {4,8},
                {4,9},
                {10,4},
                {10,9}};
        System.out.println(findWinners(arr));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<matches.length;i++){
            int curr=matches[i][1];
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }else{
                map.put(curr,1);
            }
        }
        List<List<Integer>>list=new ArrayList();

        TreeSet<Integer>set1=new TreeSet<>();
        TreeSet<Integer>set2=new TreeSet<>();
        for(int i=0;i<matches.length;i++){
            int num=matches[i][0];
            int n=matches[i][1];
            if(!map.containsKey(matches[i][0])){
                int temp1=matches[i][0];
                set1.add(matches[i][0]);
            } if(map.containsKey(matches[i][1])){
                int temp2=matches[i][1];
                if(map.get(matches[i][1])==1){
                    set2.add(matches[i][1]);
                }
            }
        }
//        System.out.println(map);
        List<Integer>list1=new ArrayList(set1);
        List<Integer>list2=new ArrayList(set2);
        list.add(list1);
        list.add(list2);
        return list;
    }
}
