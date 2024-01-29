public class binaryTry {
    public static void main(String[] args) {
        int []arr={1,2,4,6,8,23};
        System.out.println("My target exist at index "+binarySearch(arr,8));
    }
    static int binarySearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
