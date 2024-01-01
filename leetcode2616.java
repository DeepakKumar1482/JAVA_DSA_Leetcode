import java.util.*;

public class leetcode2616 {
    public static void main(String[] args) {
        int []nums={1,2,3};
        int n=nums.length;
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            l.add(subset);
        }
        System.out.println(l);
//        minimizeMax(arr,3);
    }
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums) ;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
                if(c>2){
                    nums[i+1]=Integer.MAX_VALUE;
                }
            }
            else{
                c=1;
            }
        }
        ArrayList<Integer>list=new ArrayList();
        // PriorityQueue<Integer>pq=new PriorityQueue<>();
        int max=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            list.add(nums[i+1]-nums[i]);

            //    i++;
        }
        Collections.sort(list);
        System.out.print(list);
        for(int i=0;i<p;i++){
            int a=list.get(i);
            if(list.get(i)<111111 && list.get(i)>=0){
                max=Math.max(max,list.get(i));
            }
        }
        return max;
    }

}
