import java.util.*;
public class binary_search_find_number {
    public static void main(String args[]) {
        int arr[] = {12, 34, 56, 78, 90, 92, 95, 111, 234, 456};
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = find_num(arr, num);
        System.out.println(ans);
    }

    static int find_num(int ar[], int tar) {
//        int start=0;
//        int end=ar.length-1;
//        while(start<=end){
//            int mid=(start+(end-start)/2);
//            if(tar<ar[mid]){
//                end=mid-1;
//            }
//            else if(tar>ar[mid]){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar < ar[mid]) {
                end = mid - 1;
            } else if (tar > ar[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
