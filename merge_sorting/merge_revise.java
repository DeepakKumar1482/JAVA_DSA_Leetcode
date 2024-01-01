package merge_sorting;

import com.sun.source.tree.ArrayAccessTree;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class merge_revise {
    public static void main(String[] args) {
        int arr[]={9,3,11,7,14,0,5,17,1};
        arr=sorting_array(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sorting_array(int nums[]){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int left[]=sorting_array(Arrays.copyOfRange(nums,0,mid));
        int right[]=sorting_array(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }
    public static int[] merge(int left[],int right[]){
        int merge[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merge[k]=left[i];
                i++;
            }else{
                merge[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            merge[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merge[k]=right[j];
            j++;
            k++;
        }
        return merge;
    }
}
