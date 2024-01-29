package Recursion_kunal;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(153));
    }
    public static boolean isPalindrome(int num){
        return num==helper(num);
    }
    public static int helper(int num){
        if (num%10==num){
            return (int)Math.pow(num,3);
        }
        int rem=num%10;
        int sum=(int) Math.pow(rem,3);
        return sum+helper(num/10);
    }
}
