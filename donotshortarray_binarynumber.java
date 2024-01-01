import java.util.*;
public class donotshortarray_binarynumber {
    public static void main(String args[]) {
        int arr[] = {12, 9, 7, 6, 5, 4, 2, 1, 0};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = find_num(arr, target);
        System.out.println(ans);
    }

    public static int find_num(int ar[], int tar) {
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[0] < ar[end]) {
                if (tar < ar[mid]) {
                    end = mid - 1;
                } else if (tar >ar[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
           else {
                if (tar > ar[mid]) {
                    end = mid - 1;
                } else if (tar < ar[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
