import java.math.*;
public class infinite_array_find_number {
    public static void main(String args[]){
        int arr[]={1,2,4,5,7,8,9,11,12,14,15,17,18,19,20,21,22,23,24,26,29,31,33,35,37,39,40,44,47,48,39,50};
        int target=31;
        int ans=index_number(arr,target);
        System.out.println(ans);
    }
    static int index_number(int ar[],int tar){
        int start=0;
        int end=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tar>ar[mid]) {
                start=mid+1;
                end =(int)Math.pow(2,end) ;
            }
            if(tar<ar[mid]){
                end=mid-1;
            }
            else if(tar>ar[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
