//question-Given an integer array of size n , find all elements that appears more than (n/3) items.
//where n=length of the given array;
//we will solve this question with the help of has map and the time complexity will be 0(n).
//while if I will solve this question with the help of brute force then the time complexity will be 0(n^2).
package Heap;
import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class majority_elements {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
               hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        Set<Integer>keySet=hm.keySet();
        for(Integer key:keySet){
            if(hm.get(key)>arr.length/3){
                System.out.print(" "+key+" ");
            }
        }
    }
}
