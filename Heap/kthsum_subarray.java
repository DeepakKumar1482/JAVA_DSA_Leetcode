//We have given an array and k and  we have to find the number of sub arrays with the sum k;
package Heap;

import java.util.HashMap;

public class kthsum_subarray {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer>hmap=new HashMap<>();
        hmap.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hmap.containsKey(sum-k)){
                ans+=hmap.get(sum-k);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
