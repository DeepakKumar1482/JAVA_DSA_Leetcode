package merge_sorting;

import java.util.Arrays;

public class merge_sort2 {
    public static void main(String[] args) {
        int arr[]={9,123,11,7,14,0,5,17,1};
        arr=sorting_array(arr);
        System.out.println(Arrays.toString(arr));
    }
//    static int[]sorting_array(int nums[]){
//        if(nums.length==1){
//            return nums;
//        }
//        int mid=nums.length/2;
//        int left[]= sorting_array(Arrays.copyOfRange(nums,0,mid));
//        int right[]=sorting_array(Arrays.copyOfRange(nums,mid,nums.length));
//        return merge(left,right);
//    }
//    static int []merge(int left[],int right[]){
//        int merge_array[]=new int [left.length+right.length];
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<left.length && j<right.length){
//            if(left[i]<right[j]){
//                merge_array[k]=left[i];
//                i++;
//            }
//            else{
//                merge_array[k]=right[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<left.length){
//            merge_array[k]=left[i];
//            i++;
//            k++;
//        }
//        while(j<right.length){
//            merge_array[k]=right[j];
//            j++;
//            k++;
//        }
//        return merge_array;
//    }
    public static int[]sorting_array(int arr[]){
        if(arr.length==1) {
            return arr;
        }
        int mid=arr.length/2;
        int left[]=sorting_array(Arrays.copyOfRange(arr,0,mid));
        int right[]=sorting_array(Arrays.copyOfRange(arr,mid,arr.length));
        return merge_array(left,right);
    }
    public static int[]merge_array(int left[],int right[]){
        int sort[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                sort[k]=left[i];
                i++;
            }
            else {
                sort[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            sort[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            sort[k]=right[j];
            j++;
            k++;
        }
        return sort;
    }
}
