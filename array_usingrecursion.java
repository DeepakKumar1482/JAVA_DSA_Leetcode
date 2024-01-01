public class array_usingrecursion {
    public static void main(String[] args) {
        int array[]={1,2,3,4,1,5,7};
        boolean ans=sorted_or_not(array,0);
        if(ans){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    static boolean sorted_or_not(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted_or_not(arr,index+1);
    }
}
