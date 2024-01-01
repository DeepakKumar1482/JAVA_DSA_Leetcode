package Recursion;

public class maxarray {
    public static void main(String[] args) {
        int arr[]={4,1,88,67,12};
        System.out.println(max(arr,0,0));
    }
    public static int max(int []arr,int idx,int ans){
        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]>ans){
            ans=arr[idx];
        }
      int curr=  max(arr,idx+1,ans);
        return curr;
    }
}
