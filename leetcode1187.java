import java.util.Arrays;

public class leetcode1187 {
   static int ans=0;
    public static void main(String[] args) {
        int []arr1={1,5,3,6,7};
        int []arr2={1,3,2,4};
        System.out.println(makeArrayIncreasing(arr1,arr2));
    }
    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        for(int i=1;i<arr1.length-1;i++){
            if(arr1[i]>arr1[i+1] || arr1[i]==arr1[i-1] || arr1[i]==arr1[i+1]){
             int changed=finder(arr2,arr1[i-1],arr1[i+1]);
             arr1[i]=changed;
             ans++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    return ans;
    }
    public static int finder(int []arr2,int less,int more){
        int exactnum=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>=less && arr2[i]<=more){
                exactnum=arr2[i];
                break;
            }
        }
        return exactnum;
    }
}
