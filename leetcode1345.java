import java.util.HashMap;
import java.util.HashSet;

public class leetcode1345 {
    public static void main(String[] args) {
        int arr[]={ 7,6,9,6,9,6,9,7};
        minJumps(arr);
    }
    public static void minJumps(int[] arr) {
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        if(hashSet.size()==arr.length){
//            return arr.length-1;
            System.out.println(arr.length-1);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            if(map.containsKey(arr[i])){
                map.replace(arr[i],i);
            }
        }
        int counter=0;
        int k=0;
        while (k<arr.length && k>=0){
            if(map.containsKey(arr[k]) && map.get(arr[k])!=k){
                counter++;
                k=map.get(arr[k]);
            }
            else {
                counter++;
                k++;
            }
        }
        System.out.println(counter);
    }
}
