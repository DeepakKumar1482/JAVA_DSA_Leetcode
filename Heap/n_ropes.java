//Given N ropes of different length ,the task is to connect the rope into one rope
// with minimum cost such that the cost to connect the ropes is equal to the sum of their lengths
package Heap;

import java.util.PriorityQueue;

public class n_ropes {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1){
            int min1=pq.remove();
            int min2=pq.remove();
            cost+=min1+min2;
            pq.add(min1+min2);
        }
        System.out.print(cost);
    }
}
