package Heap;

import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
//        Intersection of two arrays
        hs.clear();
        int count=0;
        for (int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                hs.remove(arr2[i]);
                count+=1;
            }
        }
        System.out.println(count);
    }
}
