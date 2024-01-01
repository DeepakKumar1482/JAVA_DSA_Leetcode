//Sorting an array in Ascending order with the help of Cyclic Sort
//An array should be in manner that numbers should be from range 1 to N
import java.util.Arrays;
import java.util.Collections;
public class cyclic_sort {
    public static void main(String args[]){
        int array[]={3,5,1,4,2};
        Cyclic_sorting(array);
        System.out.println(Arrays.toString(array));
        }
    static void Cyclic_sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1) {
                int flag=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=flag;
            }
        }
    }
}
