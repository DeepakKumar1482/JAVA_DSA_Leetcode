//We have given an array and we have to find the largest sub array which sum is equals to 0
// There can we so many sub array with sum 0
package Heap;

import java.util.HashMap;

public class largest_subarray {
    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>hmap=new HashMap<>();
//    In this hashmap first one is the sum of the sub arrays and second one is the index
        int sum=0;
        int len=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hmap.containsKey(sum)){
               len=Math.max(len,i-hmap.get(sum));
            }
            else{
                hmap.put(sum,i);
            }
        }
        System.out.println(len);
    }
}
