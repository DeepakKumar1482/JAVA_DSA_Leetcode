import java.util.*;

public class leetcode66 {
    public static void main(String[] args) {
        int arr[]={9,9,9,9};
//        arr[4]=5;
//        System.out.println( Arrays.toString(arr));
        Queue<Integer>s=new LinkedList<>();
        System.out.println(s);
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int [] plusOne(int[] digits) {
            int n=digits.length;
            digits[n-1]++;
            for(int i=n-1;i>0;i--){
                if(digits[i]==10){
                    digits[i]=0;
                    digits[i-1]++;
                }
            }
            if(digits[0]==10){
                int result[]=new int[n+1];
                result[0]=1;
                return result;
            }
            return digits;
                    }
}
