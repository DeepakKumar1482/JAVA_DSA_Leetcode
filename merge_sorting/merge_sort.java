package merge_sorting;
import java.util.*;
import java.util.concurrent.atomic.AtomicStampedReference;

public class merge_sort {
    public static void main(String[] args) {
    int arr[]={8,4,2,7,3,1};
    divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        divide(arr,s,mid);//left
        divide(arr,mid+1,e);//right
        merge(arr,s,mid,e);
    }
    public static void merge(int arr[],int s,int mid,int e){
        int []merged=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while (idx2<=e){
            merged[x++]=arr[idx2++];
        }
        for (int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
//        System.out.println(Arrays.toString(merged));
    }
}
