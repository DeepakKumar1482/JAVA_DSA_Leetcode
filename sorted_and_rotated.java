public class sorted_and_rotated {
    public static void main(String [] args){
    int nums[]={2,1,3,4};
    int ans = max(nums);
    boolean ans1 = mini_index(nums, ans);
    boolean ans2 = mini_index2(nums, ans);
        if(ans1 == true && ans2 == true){
            System.out.println("true");
    }
        else{
            System.out.println("false");
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
                System.out.println(mid);
                return mid;
            }
        }
        return -1;
    }
    static  boolean mini_index(int ar[], int max) {
        if(max==0){
            return true;
        }
        else if(ar[max-1]<=ar[max]){
            return true ;
        }
        else{
            return false;
        }
    }
    static  boolean mini_index2(int ar[], int max){

        if(max==ar.length-1){
            return true;
        }
        else if(ar[max+1]<ar[max]){
            return true;

        }
        else {
            return false;
        }

    }

}
