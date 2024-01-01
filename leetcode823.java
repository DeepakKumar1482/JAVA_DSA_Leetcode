import java.util.Arrays;
import java.util.HashMap;

public class leetcode823 {
    public static void main(String[] args) {
        int []arr={18,3,6,2};
        System.out.println(numFactoredBinaryTrees(arr));
    }
    public static int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            map.put(arr[i], 1);
        }
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    if(map.containsKey(arr[i]/arr[j])){
                        map.put(arr[j],map.get(arr[j])+1);
                        map.put(arr[i]/arr[j],map.get(arr[i]/arr[j])+1);
                    }
                }
            }
        }
        System.out.println(map);
        int ans=0;
        for (int values:map.values()){
            ans+=values;
        }
        return ans;
    }
}
