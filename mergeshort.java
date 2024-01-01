import java.util.Arrays;

public class mergeshort {
    public static void main(String[] args) {
        int arr[]={6,3,9,65,52,8};
        divider(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void divider(int arr[],int str,int end){
        if(str>=end){
            return;
        }
        int mid=str+(end-str)/2;
        divider(arr,str,mid);
        divider(arr,mid+1,end);
        mergearr(arr,str,mid,end);
    }
    public static void  mergearr(int arr[],int str,int mid, int end){
        int temp[]=new int[end-str+1];
        int i=str;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=end){
            temp[k++]=arr[j++];
        }
        for (k=0,i=str;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
//        System.out.println(Arrays.toString(arr));
    }
}
