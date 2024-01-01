//binary search in  2d array with the help of binary search
public class Binarysearch_2d_array {
    public static void main(String args[]){
        int array[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,13},
                {14,15,16,17}
        };
        int target=2;
        int arr[]=search(array,target);
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]);
    }
    static int[] search(int array[][],int target){
            int r=0;
            int c= array.length-1;
            while(r<=array.length-1 && c>0){
             if(array[r][c]==target){
                 return new int[]{r,c};
             }
             if(array[r][c]<target){
                 r++;
             }
             else{
                 c--;
             }
            }
            return new int[]{-1,-1};
    }
}
