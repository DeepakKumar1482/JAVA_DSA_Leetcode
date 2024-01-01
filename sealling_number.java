public class sealling_number {
    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 6, 8, 12, 14, 16, 18};
        int target =15;
        int ans=find_sealing(arr,target);
        System.out.println(ans);
    }
    static int find_sealing(int ar[],int tar){
        int start=0;
        int end=ar.length-1;
        int answ=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tar<ar[mid]){
                end=mid-1;
            }
            else if(tar>ar[mid]){
                start=mid+1;
            }
            else if(ar[mid]==tar) {
                return ar[mid];
            }
               }
      return ar[start];
    }
}
