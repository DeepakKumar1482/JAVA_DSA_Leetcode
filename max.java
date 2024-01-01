public class max {
    public static void main(String args[]){
        int []arr={12,34,1,56,34,98,12,67};
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int ar[]){
        int max=ar[0];
        int len=ar.length;
        for(int i=1;i<len;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

}
