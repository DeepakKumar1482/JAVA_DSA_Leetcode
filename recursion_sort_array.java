import java.util.Arrays;

public class recursion_sort_array {
    public static void main(String[] args) {
        int array[]={5,8,2,0,4,9,1,7};
       sorting_array(array,0,1);
    }
    static void sorting_array(int arr[],int ind,int index) {
        if (ind==arr.length-1){

            return ;
        }
        if(index==arr.length-2) {

            return;
        }
            if (arr[ind] > arr[index + 1]) {
               int temp=arr[ind];
               arr[ind]=arr[index+1];
               arr[index+1]=temp;
                sorting_array(arr,ind,index+1);
            }
            sorting_array(arr,ind+1,index);
    }
}
