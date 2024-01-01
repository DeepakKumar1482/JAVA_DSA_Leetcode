import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class leetcode1186 {
    public static void main(String[] args) {
        int []arr={1,-4,-5,-2,5,0,-1,2};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] arr) {
//        int []newarr=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            newarr[i]=arr[i];
//        }
//        Arrays.sort(arr);
//        int num=arr[0];
//        int idx=0;
//        for(int i=0;i<arr.length;i++){
//            if(newarr[i]==num){
//                idx=i;
//                break;
//            }
//        }
//        newarr[idx]=0;
//        int max=0;
//        int sum=0;
//        for(int i=0;i<newarr.length;i++){
//            sum+=newarr[i];
//            if(sum>max){
//                max=sum;
//            }
//            if(sum<0){
//                sum=0;
//            }
//        }
//        return max;
//        int []forward=new int[arr.length];
//        int []backward=new int[arr.length];
//        forward[0]=arr[0];
//        int j=arr.length-1;
//        backward[j]=arr[j];
//        for (int i=1;i<arr.length;i++){
//            forward[i]=Math.max(arr[i],forward[i-1]+arr[i]);
//            backward[j]=Math.max(arr[j],backward[j+1]+arr[j]);
            int n = arr.length;
            int[] dpKeep = new int[n];
            int[] dpSkip = new int[n];

            // Initialize the DP arrays with the first element
            dpKeep[0] = arr[0];
            dpSkip[0] = 0;

            int maxSum = arr[0];

            for (int i = 1; i < n; i++) {
                // Decide whether to extend the current subarray or start a new one
                dpKeep[i] = Math.max(arr[i], arr[i] + dpKeep[i - 1]);

                // Decide whether to skip the current element or use the previous subarray sum
                dpSkip[i] = Math.max(dpKeep[i - 1], dpSkip[i - 1] + arr[i]);

                // Update the maximum sum encountered so far
                maxSum = Math.max(maxSum, Math.max(dpKeep[i], dpSkip[i]));
            }

            return maxSum;
        }

    }
