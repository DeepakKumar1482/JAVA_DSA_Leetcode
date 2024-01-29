import java.util.HashMap;

public class leetcode1207 {
    public static void main(String[] args) {
        int []arr={1,8,8,1,1,13};
        uniqueOccurrences(arr);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map.values());
        int Freq_sum=0;
        int prev=0;
        int num=Integer.MAX_VALUE;
        for(int freq:map.values()){
            Freq_sum^=freq;
        }
        System.out.println(Freq_sum);
        return true;
    }
}
