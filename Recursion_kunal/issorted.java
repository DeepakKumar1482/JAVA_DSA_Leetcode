package Recursion_kunal;

public class issorted {
    public static void main(String[] args) {
        int []arr={3,4,5,6,8,0};
        System.out.println(check(arr,0));
    }
    public static boolean check(int []arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return check(arr,++idx);
    }
}
