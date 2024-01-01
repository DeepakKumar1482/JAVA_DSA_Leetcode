public class index_mountainarray {
    public static void main(String args[]){
        int arr[]={0,1,2,4,2,1};
        int target=3;//output=2
        int ans=search_index(arr);
        int ans1=mini_index(arr,ans,target);
        System.out.println(ans1);
    }
    static int search_index(int ar[]){
        int start=0;
        int end=ar.length-1;
        int max=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid+1]>ar[mid]){
                start=mid+1;
            }
            else if(ar[mid-1]>ar[mid]){
                end=mid-1;
            }
            else{
               return mid;
            }

        }
        return -1;
    }
    static int mini_index(int ar[],int max,int tar){
        if(tar<max) {
            int start = 0;
            int end=max;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(tar>ar[mid]){
                    start=mid+1;
                }
                else if (tar<ar[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        if(tar>max) {
            int start = 0;
            int end=max;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(tar<ar[mid]){
                    start=mid+1;
                }
                else if (tar>ar[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
      return -1;
    }
}
