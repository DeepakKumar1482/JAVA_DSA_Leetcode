import java.util.Arrays;

public class leetcode712 {
    public static void main(String[] args) {
        minimumDeleteSum("delete","leet");
    }

    public static int minimumDeleteSum(String s1, String s2) {
        char []arr1=s1.toCharArray();
        char []arr2=s2.toCharArray();
        Arrays.sort(arr1);;
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        return 2;
    }
}
