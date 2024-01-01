package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int ans=ls(arr,10,0);
        if(ans==-1){
            System.out.println("Number does not exists");
        }else{
            System.out.println(ans);
        }
    }
    public static int ls(int []arr,int target,int idx){
        if(target==arr[idx]){
            return idx;
        }
        if(idx==arr.length-1){
            return -1;
        }
        return ls(arr,target,idx+1);
    }
}
