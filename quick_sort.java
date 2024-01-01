import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quick_sort {
    public static void main(String[] args) {
        int nums[]={3,5,10,1,9,12,7};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int nums[],int str,int end){
if(str>=end){
    return;
}
     int pIndx=   partiton(nums,str,end);
     quicksort(nums,str,pIndx-1);
     quicksort(nums,pIndx+1,end);
    }
    public static int partiton(int nums[],int str,int end){
        int pivot=nums[end];
        int i=str-1;
        for ( int j=str;j<end;j++){
            if(nums[j]<=pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        i++;
        int temp=nums[i];
        nums[i]=pivot;
        nums[end]=temp;
        return  i;
    }
}
