import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={12,5,39,87,4,5,556,36,25,6};
         insertionsort(arr);
    }
    public static void insertionsort(int[] arr) {
        // Traverse through 1 to len(arr)
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
