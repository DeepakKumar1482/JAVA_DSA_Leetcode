////heap sort with time complexity nlog(n)
package Heap;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Heapsort {
//    public static void heapify(int arr[],int i,int size){
//        int left=2*i+1;
//        int right=2*i+2;
//        int maxInd=i;
//        if(left<size && arr[left]>arr[maxInd]){
//            maxInd=left;
//        }
//        if(right<size && arr[right]>arr[maxInd]){
//            maxInd=right;
//        }
//        if(maxInd!=i){
//            int temp=arr[i];
//            arr[i]=arr[maxInd];
//            arr[maxInd]=temp;
//            heapify(arr,maxInd,size);
//        }
//    }
//    public static void   heapsort(int arr[]){
////        step1=Build maxheap
//        int n=arr.length;
//        for(int i=0;i<n/2;i++){
//            heapify(arr,i,n);
//        }
////        step2= push largest element at end
//        for(int i=n-1;i>0;i--){
////            swap first element with first
//            int temp=arr[0];
//            arr[0]=arr[i];
//            arr[i]=temp;
//            heapify(arr,0,i);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={1,2,4,5,3};
//        heapsort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}
import java.util.Arrays;

public class Heapsort {

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap from the array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as the root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

}
