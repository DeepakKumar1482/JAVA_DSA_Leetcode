public class leetcode43 {
    public static void main(String[] args) {
        String num1="123456789";
        String num2="987654321";
        int a= Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        long c=a*b;
        System.out.println(c);
        String ans=Integer.toString(a*b);
        System.out.println(ans);
    }
}
