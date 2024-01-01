public class mountain_array {
    public static void main(String args[]) {
        int arr[] = {2,1,3,4};
        int ans = max_num(arr);
        System.out.println(ans);
    }

    static int max_num(int ar[]) {
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[mid+1] > ar[mid]) {
                start = mid + 1;
            } else if (ar[mid-1] > ar[mid]) {
                end = mid - 1;
            } else {
                return ar[mid];
            }
        }
        return 0;
    }
}