import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        int []arr1={1,2,3,0,0,0};
        int []arr2={2,5,6};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // int k=0;
        // for(int i=m;i<m+n;i++){
        //     nums1[i]=nums2[k];
        //     System.out.println(nums2[k]);
        //     k++;
        // }
        // System.out.print(Arrays.toString(nums1));
        // Arrays.sort(nums1);
        int f=0;
        int s=0;
        for(int i=0;i<m+n;i++){
            if(nums1[f]<nums2[s]){
                nums1[i]=nums1[f];
                f++;
            }
            else{
                nums1[i]=nums2[s];
                s++;
            }
        }
    }
}
