import java.util.*;
public class first_last_position {
    public static void main(String args[]){
        int arr[]={5,7,8,8,8,8};
        int target=8;
        int []ans=first_last_position(arr,target);
        for(int i=0;i<2;i++) {
            System.out.print(ans[i]+" ");
        }
    }
    static int []first_last_position(int ar[],int tar){
        int []ans={-1,-1};
        int start=search(ar,tar,true);
        int end=search(ar,tar,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
   static int search(int a[],int ta,boolean find_start_index){
        int ans=-1;
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ta<a[mid]){
                end=mid-1;
            }
            else if(ta>a[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(find_start_index){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
   }
}
