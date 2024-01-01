import java.util.Arrays;

public class selection_short {
    public static void main(String args[]){
        int array[]={3,6,1,7,9,12,0,23,54,14,56,87,11,22};
        selection(array);
        System.out.println(Arrays.toString(array));
    }
    static void selection(int arr[])
    {
        for(int i=0;i<arr.length;i++){
        int end=arr.length-i-1;
        int maxindex=max_index(arr,0,end);
            swap(arr,maxindex,end);
        }

    }
    static void swap(int arr[],int maxindex,int end){
        int temp=arr[end];
        arr[end]=arr[maxindex];
        arr[maxindex]=temp;
    }
    static int max_index(int arr[],int start,int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max] < arr[i]) {
               max=i;
            }
        }
        return max;
    }
}
