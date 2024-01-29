import java.util.HashMap;
import java.util.TreeMap;

public class leetcode2125 {
    public static void main(String[] args) {
        String []bank={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for (int i=0;i<bank.length;i++){
            for (int j=0;j<bank[i].length();j++){
                char curr=bank[i].charAt(j);
                if(curr=='1'){
                    if(map.containsKey(i)){
                        map.put(i,map.get(i)+1);
                    }else{
                        map.put(i,1);
                    }
                }
            }
        }
        int []arr=new int[map.size()];
        int l=0;
        for (int val:map.values()){
            arr[l]=val;
            l++;
        }
        int sum=0;
        for (int i=0;i<arr.length-1;i++){
            sum=sum+(arr[i]*arr[i+1]);
        }
        System.out.println(map);
        return sum;
    }
}
