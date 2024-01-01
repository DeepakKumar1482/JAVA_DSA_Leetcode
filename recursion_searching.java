public class recursion_searching {
    public static void main(String[] args) {
        int arr[]={3,2,9,18,9};
        int target=9;
        int ans=find_index(arr,target,0);
        System.out.println(ans);
    }
    static int find_index(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
         return index;
        }
        else {
            return find_index(arr, target, index + 1);
        }
    }
}
