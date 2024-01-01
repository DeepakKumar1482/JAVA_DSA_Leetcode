public class rotated_sorted_array {
    public static void main(String []args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =2 ;
        int ans = max(arr);
        int ans1 = mini_index(arr, ans, target);
        int ans2 = mini_index2(arr, ans, target);
        if(ans2==-1){
            System.out.println(ans1);
        }
        else{
            System.out.println(ans2);
        }
    }

    static int max(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        int max = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid - 1] > nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
  static  int mini_index(int ar[], int max, int tar) {
          int start = 0;
          int end = max;
          while (start <= end) {
              int mid = start + (end - start) / 2;
              if (tar > ar[mid]) {
                  start = mid + 1;
              } else if (tar < ar[mid]) {
                  end = mid - 1;
              } else  {
                  return mid;
              }
          }
      return -1;
  }
    static  int mini_index2(int ar[], int max, int tar){

            int start = max;
            int end = ar.length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (tar > ar[mid]) {
                    start = mid + 1;
                } else if (tar < ar[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }
}

